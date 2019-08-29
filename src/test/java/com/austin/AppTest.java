package com.austin;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import com.austin.dao.RoleInfoMapper;
import com.austin.dao.StudentMapper;
import com.austin.dao.UserInfoMapper;
import com.austin.entity.UserInfo;

/**
 * @author Austin
 * @since 2019/8/29 19:34   Thu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private UserInfoMapper tblUserMapper;

    @Autowired
    private RoleInfoMapper tblRoleMapper;

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert() {
        UserInfo tblUser = new UserInfo();
        tblUser.setNickName("Jack12");
        tblUser.setEmail("yangxiaochen12");
        tblUser.setNamespace("log12");
        tblUser.setUsername("Chou12");
        tblUser.setPdbId(5345345L);
        tblUser.setSalt("trgdfgdfgdf");
        tblUser.setPdbName("BDG");
        tblUser.setStatus(new Byte("0"));
        tblUser.setToken("rewrewrwerewrwe");
        tblUser.setReadToken("rewrewrwerewrw");
        tblUser.setPhone("143432432453");
        tblUser.setPortrait("trterter");
        tblUser.setPassword("ttetqe");
        tblUser.setOrgId(2342342L);
        tblUser.setOrgName("BDG");
        tblUser.setCreateTime(new Date());
        tblUser.setUpdateUser("yangxiaochen");
        tblUser.setExtension("extension");
        tblUserMapper.insert(tblUser);
    }

    @Test
    public void testFindAll() {
        List<UserInfo> roles = tblUserMapper.selectAll();
        if (!CollectionUtils.isEmpty(roles)) {
            for (UserInfo role : roles) {
                System.out.println(role);
            }
        }
    }

    @Test
    public void testInsertStudent(){
        studentMapper.insert("tom", "rocket", 18);
    }
}