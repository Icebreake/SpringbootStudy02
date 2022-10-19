package com.example.service.impl;

import com.example.bean.Person1;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person1 person1;

    @Override
    public Person1 getPersonInfo() {
        return null;
    }
}
