package com.cn.mcheat.gen.repo;

import com.cn.mcheat.gen.data.Spitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */
@Repository
public class SessionRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Spitter> queryValuesById(Long id) {
        List<Spitter> result = currentSession().createCriteria(Spitter.class).list();
        return result;
    }

}
