package com.mall.service.impl;

import com.mall.core.mapper.dao.UserMapperDao;
import com.mall.core.model.UserModel;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapperDao userMapperDao;

    @Override
    public UserModel queryUserByName(String username) {
        return userMapperDao.queryByName(username);
    }
}
