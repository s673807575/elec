package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.dao.UserDao;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 67380 on 2016/9/26.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("/test")
    public String test(Model model){

        return "test/test";
    }
}
