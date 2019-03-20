package com.mall.core.mapper.dao;

import com.mall.core.model.UserPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleRelationMapperDao {


    List<UserPermission> getUserPermissionBy(@Param("userId") Long userId);

}
