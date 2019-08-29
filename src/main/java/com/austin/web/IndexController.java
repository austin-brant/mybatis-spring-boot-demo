package com.austin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.austin.dao.RoleInfoMapper;
import com.austin.entity.RoleInfo;

import io.swagger.annotations.ApiOperation;

/**
 * @author Austin
 * @since 2019/8/29 19:54   Thu
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @ApiOperation(value = "保存角色")
    @GetMapping(value = "/role/save")
    public String save(@RequestParam String roleName) {
        RoleInfo role = new RoleInfo();
        role.setRoleName(roleName);
        role.setRoleLevel(new Byte("0"));
        role.setUpdateUser("admin");
        role.setStatus(new Byte("0"));
        roleInfoMapper.insert(role);
        return role.toString();
    }
}
