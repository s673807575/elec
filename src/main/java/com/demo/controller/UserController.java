package com.demo.controller;

import com.demo.dao.UserDao;
import com.demo.entity.Pro_message;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 67380 on 2016/9/26.
 */
@Controller
@RequestMapping("/")
public class UserController{

    @Resource
    private UserDao userDao;



    @RequestMapping("/test")
    public String test(Model model,Pro_message  p){
        System.out.println(p.getStartTime());
        return "test/test";
    }
}
