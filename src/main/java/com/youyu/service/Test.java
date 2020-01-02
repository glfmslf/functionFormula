package com.youyu.service;


import com.youyu.entity.Emp;

import java.util.function.Function;

/**
 * @author: youyu  工号：1552
 * CREATED_DATE: 2020/1/2 16:32
 */
public class Test {
    public static void main(String[] args) {
//        TestInterface testInterface = ()->System.out.println("sssssss");
//        testInterface.doSomeThing();
//        testInterface.printTest();
//        ParamsInterface p = (a,b) -> a + b;
//        System.out.println(p.add(5,6));
//        Function<Integer, Integer> function1 = x -> x * 2;
        //        System.out.println(function1.apply(4));// 8
        //
        //        Function<Integer, String> function2 = x -> x * 2 + "dd";
        //        System.out.println(function2.apply(4));//8dd
        //
        //        Function<String, String> strFunction1 = (str) -> new String(str);
        //        System.out.println(strFunction1.apply("aa"));//aa
        //
        //        Function<String, String> strFunction2 = String::new;
        //        System.out.println(strFunction2.apply("bb"));//bb
        //
        //        Function<String, Emp> objFunction1 = (str) -> new Emp(str);
        //        System.out.println(objFunction1.apply("cc").getName());//cc
        //
        //        Function<String, Emp> objFunction2 = Emp::new;
        //        System.out.println(objFunction2.apply("dd").getName());
//        Function<Integer, Integer> function = x -> x * 2;
//        System.out.println(function.apply(2));

        Function<String, String> function1 = (string) -> string +string;
        System.out.println(function1.apply("aaa"));

        Function<String,String> function2 =s -> new String(s);
        System.out.println(function2.apply(function2.apply("sss")));

//        Function<String, Emp> function = s -> new Emp(s);
//        System.out.println(function.apply("yy"));

        Function<String, Emp> function3 = Emp::new;
        System.out.println(function3.apply("yy"));
    }
}
