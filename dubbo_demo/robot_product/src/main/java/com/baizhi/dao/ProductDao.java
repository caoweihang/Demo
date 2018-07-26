package com.baizhi.dao;

import com.baizhi.entity.Product;

import java.util.List;

public interface ProductDao {

    List<Product> findAll();

    Product findOne(String id);
}
