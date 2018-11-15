package com.dalaoyang.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dalaoyang.dao.UserMapper;
import com.dalaoyang.entity.User;
import com.dalaoyang.service.UserSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot_mybatisplus
 * @description: userservice
 * @author: Mr.Wang
 * @create: 2018-11-14 14:38
 **/
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserSerivce {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}