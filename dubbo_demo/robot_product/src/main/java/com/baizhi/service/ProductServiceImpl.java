package com.baizhi.service;

import com.baizhi.dao.ProductDao;
import com.baizhi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = ProductService.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findByUser(String userid) {
        return productDao.findOne(userid);
    }
}
