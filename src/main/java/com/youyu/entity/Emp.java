package com.youyu.entity;

/**
 * @author: youyu  工号：1552
 * CREATED_DATE: 2020/1/2 20:14
 */
public class Emp {
    private String name;

    public Emp() {

    }

    public Emp(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                '}';
    }
}
