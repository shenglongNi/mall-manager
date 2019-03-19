package com.test;


import com.mall.MallWebApplication;
import com.mall.core.mapper.dao.UserMapperDao;
import com.mall.core.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MallWebApplication.class})
public class DaoTest {

    @Autowired
    private UserMapperDao userMapperDao;


    @Test
    public void test() {

        UserModel userModel = userMapperDao.queryByName("admin");
        System.out.println(userModel);
    }
}
