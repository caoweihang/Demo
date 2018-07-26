package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private String id;
    private String name;
    private Integer age;
    private Date bir;

    public User(String id, String name, Integer age, Date bir) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
    }

    public User() {

    }
}


