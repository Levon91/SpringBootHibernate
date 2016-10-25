package com.example.dao.impl;

import com.example.dao.ITestDao;
import com.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by levont on 25/10/2016.
 */
@Repository
public class ITestDaoImpl implements ITestDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void test(Person person) {
        Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.persist(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
