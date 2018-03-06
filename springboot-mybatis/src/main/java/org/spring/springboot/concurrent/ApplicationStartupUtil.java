package org.spring.springboot.concurrent;

import org.spring.springboot.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class ApplicationStartupUtil {

    private static List<BaseHealthChecker> baseHealthCheckers;

    private static CountDownLatch countDownLatch;

    private static ApplicationStartupUtil instance = new ApplicationStartupUtil();

    private ApplicationStartupUtil(){}

    public static ApplicationStartupUtil getInstance(){
        return instance;
    }

    public static boolean checkExternalServices() throws Exception{
        countDownLatch = new CountDownLatch(3);
        baseHealthCheckers = new ArrayList<BaseHealthChecker>();
        baseHealthCheckers.add(new NetworkHealthChecker(countDownLatch));
        baseHealthCheckers.add(new CacheHealthChecker(countDownLatch));
        baseHealthCheckers.add(new DatabaseHealthChecker(countDownLatch));

        Executor executor = Executors.newFixedThreadPool(baseHealthCheckers.size());
        for(final BaseHealthChecker baseHealthChecker:baseHealthCheckers){
            executor.execute(baseHealthChecker);
        }
        countDownLatch.await();

        for(final BaseHealthChecker baseHealthChecker:baseHealthCheckers){
            if(!baseHealthChecker.isServiceUp()){
                return false;
            }
        }
        return true;
    }
}
