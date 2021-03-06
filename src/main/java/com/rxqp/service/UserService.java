package com.rxqp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxqp.entity.User;
import com.rxqp.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
    private UserMapper userMapper;
   
    public List<User> likeName(String name){
        return userMapper.likeName(name);
    }
}
