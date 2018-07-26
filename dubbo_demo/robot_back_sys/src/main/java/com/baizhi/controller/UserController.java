package com.baizhi.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baizhi.entity.Product;
import com.baizhi.entity.User;
import com.baizhi.service.ProductService;
import com.baizhi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")

public class UserController {

    @Reference
    private ProductService productService;

    @Reference
    private UserService userService;


    @RequestMapping("/findAll")
    public String findAll(Model model){

        List<User> all = userService.findAll();
        Product product = productService.findByUser("1");

        model.addAttribute("users",all);
        model.addAttribute("product",product);

        return "showAll";
    }
}
