package com.cn.mcheat.gen.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/23.
 */
@Repository
public class JdbcRepository {


    private JdbcOperations jdbcOperations;

    public JdbcRepository(@Autowired JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public int insertValues(String sql) {
        int num = jdbcOperations.update(sql);
        return num;
    }

    public Map queryValuesById(String sql, Long id) {
        Map result = jdbcOperations.queryForMap(sql, id);
        return result;
    }


}
