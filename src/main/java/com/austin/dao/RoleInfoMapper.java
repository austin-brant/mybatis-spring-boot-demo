package com.austin.dao;

import com.austin.entity.RoleInfo;
import java.util.List;

public interface RoleInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleInfo record);

    RoleInfo selectByPrimaryKey(Long id);

    List<RoleInfo> selectAll();

    int updateByPrimaryKey(RoleInfo record);
}