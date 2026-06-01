package com.la.summer.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Item {

    private int id;
    private String name;
    private Double price;

    private Store store;

//    public Item(int id, String name, Double price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void someFuncItem() {
        System.out.println("Neki random text");
    }
}
