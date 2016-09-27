package com.demo.service;

import com.demo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 67380 on 2016/9/26.
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;
}
