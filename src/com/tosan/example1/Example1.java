package com.tosan.example1;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    // General Syntax
    // parameters -> expression : for functional programming
    // Parameter Syntax:
    // 1-Zero parameter:
    //   1.1- () -> expression
    // 2- One parameter
    //   2.1- (param) -> expression
    //   2.2- param -> expression
    //   2.3- (Type param) -> expression
    // 3- More than one parameter
    //   3.1- (param1, param2, ...) -> expression
    //   3.2- (Type1 param1, Type2 param2, ...) -> expression
    // Expression Syntax:
    // 1- One line of statement:
    //   1.1- parameter -> expression
    //      note: if you have to return -> nothing changes
    //   1.2- parameter -> {expression;}
    //      note: if you have to return -> {...;return something;}
    // 2- More than one line of statement:
    //   2.1- parameter -> {statement1;statement2;}
    //      note: if you have to return -> {statement1;...; return something;}
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
//        Consumer<String> consumer = t-> System.out.println(t);
//        list.forEach(consumer);
        list.forEach(t -> System.out.println(t));
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String t) {
//                System.out.println(t);
//            }
//        };
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
//        list.forEach(consumer);
    }
}
