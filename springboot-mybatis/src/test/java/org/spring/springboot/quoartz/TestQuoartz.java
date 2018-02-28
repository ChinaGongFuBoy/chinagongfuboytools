package org.spring.springboot.quoartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestQuoartz {

    @Autowired
    private QuoartzService quoartzService;

    @Test
    public void testTiming() throws InterruptedException {
        Thread.sleep(10000L);
        quoartzService.matchAllTrade();
    }
}
