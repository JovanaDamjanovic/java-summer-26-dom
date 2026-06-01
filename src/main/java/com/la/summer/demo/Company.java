package com.la.summer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

    @Autowired
    @Qualifier("stefan")
    private Employee employee;

//    public Company(Employee employee) {
//        this.employee = employee;
//    }
}
