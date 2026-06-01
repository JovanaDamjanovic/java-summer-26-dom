package com.la.summer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store {

//   1. nacin DI  - @Autowired
    private Item item;

//   2.nacin - konstruktor
    public Store(Item item) {
        this.item = item;
    }

//  3.nacin - setter
    public void setItem(Item item) {
        this.item = item;
    }
}
