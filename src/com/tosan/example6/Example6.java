package com.tosan.example6;

import java.util.function.*;

public class Example6 {
    public static void main(String[] args) {
//        Consumer<String> consumer = str -> System.out.println(str);
//        BiConsumer<String, Integer> biConsumer = (str, index) -> System.out.println(str + " " + index);
//        Function<Integer, String> function = (index) -> String.valueOf(index);
//        BiFunction<Integer, Long, String> biFunction;
//        Supplier<String> supplier = () -> "Majid";
//        Predicate<String> predicate = str -> str == null ? false : true;
//        BiPredicate<Integer, String> biPredicate;
//        UnaryOperator<String> unaryOperator;
//        BinaryOperator<Integer> binaryOperator;
        walk(t->(long)t*2);
        walk(t->(long)t);
        walk(new Function<Integer, Long>() {
            @Override
            public Long apply(Integer integer) {
                return (long)integer* 3;
            }
        });
    }

    public static void walk(Function<Integer, Long> function){
        System.out.println("I am going to walk");
        System.out.println("Let me check how many step i should walk");
        System.out.println("Let me walk");
        System.out.println("I walked " + function.apply(10));
    }
}
