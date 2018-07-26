package com.baizhi.service;

import com.baizhi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findByUser(String userid);
}
