package com.mall.core.mapper.dao;

import com.mall.core.model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserMapperDao {

    UserModel queryByName(@Param("username") String username);
}
