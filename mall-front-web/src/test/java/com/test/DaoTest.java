package com.test;


import com.mall.MallWebApplication;
import com.mall.core.mapper.dao.UserMapperDao;
import com.mall.core.mapper.dao.UserRoleRelationMapperDao;
import com.mall.core.model.UserModel;
import com.mall.core.model.UserPermission;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MallWebApplication.class})
public class DaoTest {

    @Autowired
    private UserMapperDao userMapperDao;

    @Autowired
    private UserRoleRelationMapperDao userRoleRelationMapperDao;

    @Test
    @Ignore
    public void test() {

        UserModel userModel = userMapperDao.queryByName("admin");
        System.out.println(userModel);
    }

    @Test
    public void testRole() {
        List<UserPermission> permissions = userRoleRelationMapperDao.getUserPermissionBy(3L);
        for(UserPermission userPermission : permissions) {
            System.out.println(userPermission);
        }
    }
}
