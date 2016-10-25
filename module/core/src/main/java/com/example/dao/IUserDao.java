package com.example.dao;

import com.example.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by levont on 25/10/2016.
 */
@Repository
public interface IUserDao {

    void addUser(User user);
}
