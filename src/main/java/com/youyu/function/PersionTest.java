package com.youyu.function;

import com.youyu.data.Data;
import com.youyu.entity.PersonModel;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author: youyu  工号：1552
 * CREATED_DATE: 2019/12/27 17:20
 */
public class PersionTest {

    static List<PersonModel> data = Data.getData();
    public static void main(String[] args) {
        //new
        List<PersonModel> collect = data
                .stream()
                .filter(person1 -> "男".equals(person1.getSex()))
                .collect(toList());
        System.out.println(collect);
        List<PersonModel> list = data.stream().filter(personModel -> personModel.getAge() <= 18).collect(toList());
        System.out.println(list);
    }
}
