package com.example.manager.impl;

import com.example.dao.ITestDao;
import com.example.manager.ITestManager;
import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.server.ServerNotActiveException;

/**
 * Created by levont on 25/10/2016.
 */
@Service
@Transactional(readOnly = true)
public class ITestManagerImpl implements ITestManager {

    @Autowired
    private ITestDao testDao;

    @Override
    public void test(Person person) throws ServerNotActiveException {
        testDao.test(person);
    }
}
