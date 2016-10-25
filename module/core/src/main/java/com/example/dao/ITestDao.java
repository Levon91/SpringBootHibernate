package com.example.dao;

import com.example.model.Person;
import org.springframework.stereotype.Repository;

/**
 * Created by levont on 25/10/2016.
 */
@Repository
public interface ITestDao {

    void test(Person person);
}
