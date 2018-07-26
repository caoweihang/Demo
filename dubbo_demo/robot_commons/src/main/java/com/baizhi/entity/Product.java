package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Product implements Serializable {

    private String id;
    private String name;
    private Double price;
    private Date date;

    public Product() {
    }

    public Product(String id, String name, Double price, Date date) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }
}
