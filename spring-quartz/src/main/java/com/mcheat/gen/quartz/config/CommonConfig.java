package com.mcheat.gen.quartz.config;

import com.mcheat.gen.quartz.job.MyJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 配置文件
 *
 * @author wangjy
 * @date 2017/6/14.
 */
@Configuration
public class CommonConfig {

    @Bean
    public JobDetailFactoryBean getJobFactory() {
        JobDetailFactoryBean factory = new JobDetailFactoryBean();
        factory.setJobClass(MyJob.class);
        factory.setDurability(true);
        return factory;
    }

    @Bean
    public CronTriggerFactoryBean tigger() {
        CronTriggerFactoryBean tigger = new CronTriggerFactoryBean();
        tigger.setJobDetail(getJobFactory().getObject());
        tigger.setCronExpression("0/5 * * ? * *");
        return tigger;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
        scheduler.setJobDetails(getJobFactory().getObject());
        scheduler.setTriggers(tigger().getObject());
        return scheduler;
    }





}
