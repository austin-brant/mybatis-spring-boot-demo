package com.austin.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Long id;

    private Date createTime;

    private String email;

    private String extension;

    private String namespace;

    private String nickName;

    private Long orgId;

    private String orgName;

    private String password;

    private Long pdbId;

    private String pdbName;

    private String phone;

    private String portrait;

    private String salt;

    private Byte status;

    private String token;

    private Date updateTime;

    private String updateUser;

    private String username;

    private String readToken;

    private static final long serialVersionUID = 1L;

    public UserInfo(Long id, Date createTime, String email, String extension, String namespace, String nickName, Long orgId, String orgName, String password, Long pdbId, String pdbName, String phone, String portrait, String salt, Byte status, String token, Date updateTime, String updateUser, String username, String readToken) {
        this.id = id;
        this.createTime = createTime;
        this.email = email;
        this.extension = extension;
        this.namespace = namespace;
        this.nickName = nickName;
        this.orgId = orgId;
        this.orgName = orgName;
        this.password = password;
        this.pdbId = pdbId;
        this.pdbName = pdbName;
        this.phone = phone;
        this.portrait = portrait;
        this.salt = salt;
        this.status = status;
        this.token = token;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.username = username;
        this.readToken = readToken;
    }

    public UserInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace == null ? null : namespace.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getPdbId() {
        return pdbId;
    }

    public void setPdbId(Long pdbId) {
        this.pdbId = pdbId;
    }

    public String getPdbName() {
        return pdbName;
    }

    public void setPdbName(String pdbName) {
        this.pdbName = pdbName == null ? null : pdbName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getReadToken() {
        return readToken;
    }

    public void setReadToken(String readToken) {
        this.readToken = readToken == null ? null : readToken.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", email=").append(email);
        sb.append(", extension=").append(extension);
        sb.append(", namespace=").append(namespace);
        sb.append(", nickName=").append(nickName);
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", password=").append(password);
        sb.append(", pdbId=").append(pdbId);
        sb.append(", pdbName=").append(pdbName);
        sb.append(", phone=").append(phone);
        sb.append(", portrait=").append(portrait);
        sb.append(", salt=").append(salt);
        sb.append(", status=").append(status);
        sb.append(", token=").append(token);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", username=").append(username);
        sb.append(", readToken=").append(readToken);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}