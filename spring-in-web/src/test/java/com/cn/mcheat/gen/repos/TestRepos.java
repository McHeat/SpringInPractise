package com.cn.mcheat.gen.repos;

import com.cn.mcheat.gen.config.WebConfig;
import com.cn.mcheat.gen.data.Spitter;
import com.cn.mcheat.gen.repo.JdbcRepository;
import com.cn.mcheat.gen.repo.JpaRepository;
import com.cn.mcheat.gen.repo.SessionRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@ContextConfiguration(classes = WebConfig.class)
@WebAppConfiguration
@EnableTransactionManagement
public class TestRepos {

    @Autowired
    private JdbcRepository jdbcRepository;

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private JpaRepository jpaRepository;

    @Test
    public void testInsert() {
        String sql = "INSERT INTO spitter (USER_NAME, PASSWORD, FULL_NAME) VALUES ('wangjy', 'r00t@1234', '王敬源')";

        int num = jdbcRepository.insertValues(sql);
        Assert.assertEquals(num, 1);
    }

    @Test
    public void testQuery() {
        String sql = "SELECT * from spitter WHERE ID = ?";
        Map map = jdbcRepository.queryValuesById(sql, (long) 1);
        for (Object key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }

    @Test
    public void testSessionFactory() {
        List<Spitter> spitters = sessionRepository.queryValuesById(Long.parseLong("1"));
        System.out.println(spitters.size());
        Assert.assertEquals(spitters.size(), 1);
    }

    @Test
    public void testEntityManagerFacotry() {
        Spitter spitter = jpaRepository.queryValuesById((long) 1);
        System.out.println(spitter.getFullName());
    }

}
