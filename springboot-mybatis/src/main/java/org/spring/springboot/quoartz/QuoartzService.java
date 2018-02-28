package org.spring.springboot.quoartz;

import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@Component
@SuppressWarnings("rawtypes")
@PropertySource(value="classpath:quoartz.properties")
public class QuoartzService {

    @Scheduled(cron = "${jobs.message}")
    public void matchAllTrade() {
        System.out.println("###########定时任务轮开始####################");
//		for (ICfetsTradeMatchUnit matchUnit : cfetsTradeMatchUnits) {
//			cfetsTradeMatchExecutor.execute(matchUnit);
//		}
        System.out.println("###########定时任务轮结束####################");
    }
}
