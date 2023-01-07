package com.gzf.service.impl;



import com.gzf.bean.UserBean;
import com.gzf.mapper.UserMapper;
import com.gzf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class IUserService implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserBean> query() {
        return userMapper.query();
    }
}