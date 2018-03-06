package org.spring.springboot.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class CacheHealthChecker extends BaseHealthChecker {

    public CacheHealthChecker(CountDownLatch countDownLatch){
        super(countDownLatch,"cache health checker");
    }
    @Override
    public void verifyService(){
        System.out.println("checking service name is "+this.getServiceName());
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(this.getServiceName()+" is up");
    }
}
