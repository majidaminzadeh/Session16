package com.tosan.example2;

public class Example2 {
    public static void main(String[] args) {
//        MyInterface1 myInterface1 = () -> System.out.println("test");
//        doPrint(myInterface1);
//        MyInterface2 myInterface2 = (str) -> System.out.println(str);
//        MyInterface2 myInterface2 = str -> System.out.println(str);
//        MyInterface2 myInterface2 = (String str) -> System.out.println(str);
//        doPrint(myInterface2);
//        MyInterface3 myInterface3 = (str, index) -> System.out.println(index + " -> " + str);
//        doPrint(myInterface3);
//        myInterface3 = (str, index) -> System.err.println(index + " -> " + str);
//        doPrint(myInterface3);
    }

    public static void doPrint(MyInterface1 myInterface1){
        myInterface1.print();
    }

    public static void doPrint(MyInterface2 myInterface2){
        myInterface2.print("1 parameter lambda expression");
    }

    public static void doPrint(MyInterface3 myInterface3){
        myInterface3.print("More than 1 parameter lambda expression", 10);
    }

    public interface MyInterface2 {
        void print(String str);
    }

    public interface MyInterface3 {
        void print(String str, int index);
    }
}
