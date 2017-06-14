package com.cn.mcheat.gen.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Administrator on 2016/12/16.
 */
@Configuration
@EnableMongoRepositories
public class MongoConfig {

    @Bean
    public MongoFactoryBean mongo() {
        MongoFactoryBean mongoFactoryBean = new MongoFactoryBean();
        mongoFactoryBean.setHost("localhost");
        return mongoFactoryBean;
    }

/*    @Bean
    public Mongo mongo() {
        Mongo mongo = new MongoClient("localhost");
        return mongo;
    }*/

    @Bean
    public MongoOperations mongoOperations(Mongo mongo) {
        return new MongoTemplate(mongo, "OrdersDB");
    }

}
