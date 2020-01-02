package com.youyu.service;

/**
 * @author: youyu  工号：1552
 * CREATED_DATE: 2020/1/2 16:32
 */
public class Test {
    public static void main(String[] args) {
        TestInterface testInterface = ()->System.out.println("sssssss");
        testInterface.doSomeThing();
        testInterface.printTest();
        ParamsInterface p = (a,b) -> a + b;
        System.out.println(p.add(5,6));
    }
}
