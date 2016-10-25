package com.example.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

/**
 * Created by levont on 25/10/2016.
 */
public abstract class BaseDao {
    protected SessionFactory sessionFactory;
    Transaction tx = null;

    @Autowired
    public BaseDao(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }
}
