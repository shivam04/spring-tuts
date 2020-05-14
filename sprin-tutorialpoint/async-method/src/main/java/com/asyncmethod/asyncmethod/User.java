package com.asyncmethod.asyncmethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * Date: 14/05/2020 - 8:15 am
 * User: shivam.si
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class User {
    private String name;
    private String blog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", blog=" + blog + "]";
    }
}
