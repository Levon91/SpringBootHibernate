package com.example.dao.impl;

import com.example.dao.IUserDao;
import com.example.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;

/**
 * Created by levont on 25/10/2016.
 */
@Service
public class IUserDaoImpl extends BaseDao implements IUserDao {

    public IUserDaoImpl(EntityManagerFactory factory) {
        super(factory);
    }

    @Override
    public void addUser(User user) {
        Session currentSession = sessionFactory.openSession();
        try {
            tx = currentSession.beginTransaction();
            currentSession.persist(user);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            currentSession.close();
        }
    }
}
