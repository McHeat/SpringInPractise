package com.mcheat.gen.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by Administrator on 2017/6/14.
 */
public class MyJob extends QuartzJobBean {

    private final Logger logger = LoggerFactory.getLogger(MyJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("=====================================================");
        logger.info("I'm in work....");
        logger.info("=====================================================");
    }
}
