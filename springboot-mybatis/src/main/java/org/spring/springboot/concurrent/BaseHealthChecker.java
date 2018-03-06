package org.spring.springboot.concurrent;

import ch.qos.logback.core.encoder.EchoEncoder;

import java.util.concurrent.CountDownLatch;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public abstract class BaseHealthChecker implements Runnable{

    private CountDownLatch countDownLatch;

    private String serviceName;

    private boolean isServiceUp;

    public BaseHealthChecker(CountDownLatch countDownLatch,String serviceName){
        this.countDownLatch = countDownLatch;
        this.serviceName = serviceName;
        this.isServiceUp = false;
    }

    @Override
    public void run(){
        try {
            verifyService();
        }catch (Exception e){
            e.printStackTrace();
            isServiceUp = false;
        }finally {
            if(countDownLatch != null){
                countDownLatch.countDown();
            }
        }
    }

    public abstract void verifyService();

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isServiceUp() {
        return isServiceUp;
    }

    public void setServiceUp(boolean serviceUp) {
        isServiceUp = serviceUp;
    }
}
