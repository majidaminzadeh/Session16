package com.tosan.example5;

import java.util.LinkedList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        Example5 example5 = new Example5();
        example5.doSomething();
    }

    void doSomething(){
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
//        Example5 example5 = new Example5();
        list.forEach(System.out::println);
    }

    static void print(String str){
        System.out.println(str);
    }
}
