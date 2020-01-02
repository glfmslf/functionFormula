package com.youyu.service;

import jdk.nashorn.internal.objects.annotations.Function;

/**
 * @author: youyu  工号：1522
 * CREATED_DATE: 2020/1/2 16:26
 */
@FunctionalInterface
public interface TestInterface {

    @Function
    void doSomeThing();

    default void printTest() {
        System.out.println("test function interface");
    }
}
