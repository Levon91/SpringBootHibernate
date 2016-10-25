package com.example.manager;

import com.example.model.Person;

import java.rmi.server.ServerNotActiveException;

/**
 * Created by levont on 25/10/2016.
 */
public interface ITestManager {

    void test(Person person) throws ServerNotActiveException;
}
