package org.spring.springboot.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class DatabaseHealthChecker extends BaseHealthChecker{

    public DatabaseHealthChecker(CountDownLatch countDownLatch){
        super(countDownLatch,"data base Health checker");
    }
    @Override
    public void verifyService(){
        System.out.println("checking service name is "+this.getServiceName());
        try {
            Thread.sleep(6000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(this.getServiceName()+" is up");
    }
}
