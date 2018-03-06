package org.spring.springboot.pattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试几种单利的速度
 * @author yigang.wu
 * @date created in $time $date
 */
public class TestSingleton {

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0; i < threadNum; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000;i++){
                        Object o = Singleton5.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }
            ).start();

            countDownLatch.await();
            long end = System.currentTimeMillis();
            System.out.println("耗时："+(end - start));
        }
    }
}
