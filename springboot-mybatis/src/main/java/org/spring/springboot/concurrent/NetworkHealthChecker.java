package org.spring.springboot.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class NetworkHealthChecker extends BaseHealthChecker {

    public NetworkHealthChecker(CountDownLatch countDownLatch){
        super(countDownLatch,"net work health checker");
    }
    @Override
    public void verifyService(){
        System.out.println("checking service name is "+this.getServiceName());
        try {
            Thread.sleep(7000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(this.getServiceName()+" is up");
    }
}
