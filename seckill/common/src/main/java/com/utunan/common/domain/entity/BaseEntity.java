package com.utunan.common.domain.entity;

import java.io.Serializable;

/**
 * 实体类基本字段
 *
 * @author xiaozhengwei
 * @since V1.0.0
 */
public class BaseEntity implements Serializable {

    /**
     * 创建角色
     */
    public Long createUser;
    /**
     * 更新角色
     */
    public Long updateUser;
    /**
     * 创建时间
     */
    public String createTime;
    /**
     * 更新时间
     */
    public String updateTime;
    /**
     * 数据标识
     */
    public Integer sign;

    public Long getCreateUser() {

        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

}
