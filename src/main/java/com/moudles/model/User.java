package com.moudles.model;

import com.common.persistence.DataEntity;

public class User extends DataEntity<User>{

    private String user;

    private String sex;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}