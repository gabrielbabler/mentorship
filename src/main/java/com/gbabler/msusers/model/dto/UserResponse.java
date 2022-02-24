package com.gbabler.msusers.model.dto;

import com.gbabler.msusers.model.domain.UserDomain;

public class UserResponse {

    private Integer id;
    private String name;
    private Integer age;

    public UserResponse(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static UserResponse valueOf(UserDomain userDomain) {
        return new UserResponse(userDomain.getId(), userDomain.getName(), userDomain.getAge());
    }
}
