package com.mall.service;

import com.mall.core.model.UserModel;

public interface UserService {

    UserModel queryUserByName(String username);
}
