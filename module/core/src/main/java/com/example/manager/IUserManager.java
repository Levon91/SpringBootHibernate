package com.example.manager;

import com.example.model.User;

import java.rmi.server.ServerNotActiveException;

/**
 * Created by levont on 25/10/2016.
 */
public interface IUserManager {

    void addUser(User user) throws ServerNotActiveException;
}
