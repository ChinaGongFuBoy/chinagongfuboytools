package org.spring.springboot.quoartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@Component
public class QuartzDemo {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void work(){
        System.out.println("执行定时任务开始"+new Date());
    }
}
