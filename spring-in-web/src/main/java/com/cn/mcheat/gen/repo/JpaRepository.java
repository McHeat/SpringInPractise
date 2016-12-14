package com.cn.mcheat.gen.repo;

import com.cn.mcheat.gen.data.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by Administrator on 2016/12/10.
 */
@Repository
@Transactional
public class JpaRepository {

//    @PersistenceUnit
//    private EntityManagerFactory entityManagerFactory;

    @PersistenceContext
    private EntityManager entityManager;

    public Spitter queryValuesById(Long id) {
//        Spitter result = entityManagerFactory.createEntityManager().find(Spitter.class, id);
        Spitter result = entityManager.find(Spitter.class, id);
        return result;
    }


}
