package com.example.eurekaserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wuqihua<wuqihua @ corp.netease.com>
 * @since 2018/8/30
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list =Collections.emptyList();
        //List<Integer> list = Arrays.asList(1,2,3);
        //List<Integer> list =new ArrayList<>();
        //list = new ArrayList<>(list);
        //list.add(1);

        List<Integer> list1 = new ArrayList<>();
        Integer a = 1;
        list1.add(a);
        list.addAll(list1);
        System.out.println("pre");

    }
}
