package com.example.manager.impl;

import com.example.dao.IUserDao;
import com.example.manager.IUserManager;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.server.ServerNotActiveException;

/**
 * Created by levont on 25/10/2016.
 */
@Service
@Transactional(readOnly = true)
public class IUserManagerImpl implements IUserManager {

    @Autowired
    private IUserDao testDao;

    @Override
    public void addUser(User user) throws ServerNotActiveException {
        testDao.addUser(user);
    }
}
