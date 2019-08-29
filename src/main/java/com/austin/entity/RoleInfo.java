package com.austin.entity;

import java.io.Serializable;
import java.util.Date;

public class RoleInfo implements Serializable {
    private Long id;

    private String roleName;

    private Byte roleLevel;

    private Byte status;

    private Date updateTime;

    private String updateUser;

    private static final long serialVersionUID = 1L;

    public RoleInfo(Long id, String roleName, Byte roleLevel, Byte status, Date updateTime, String updateUser) {
        this.id = id;
        this.roleName = roleName;
        this.roleLevel = roleLevel;
        this.status = status;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    public RoleInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Byte getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Byte roleLevel) {
        this.roleLevel = roleLevel;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleLevel=").append(roleLevel);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}