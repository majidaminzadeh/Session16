package com.tosan.example3;

public class Example3 {

    // index -> method();
    // public void method(){
    // statement1
    // statement2
    // statement3
    // ...
    //

    public static void main(String[] args) {
//        InterfaceWithoutReturn interfaceLambda = () -> System.out.println("Test");
//        doPrint(interfaceLambda);
//        interfaceLambda = () -> {
//            System.out.println("More than 1 line");
//            System.out.println("2nd line");
//        };
//        doPrint(interfaceLambda);
        InterfaceWithReturn withReturn = () -> "Majid";
        doPrint(withReturn);
        withReturn = () -> {
            String s = "test";
            return "Majid";
        };
    }

    private static void doPrint(InterfaceWithoutReturn interfaceLambda) {
        interfaceLambda.print();
    }

    private static void doPrint(InterfaceWithReturn interfaceLambda) {
        System.out.println("lambda returns: " + interfaceLambda.print());
    }

    interface InterfaceWithoutReturn{
        void print();
    }

    interface InterfaceWithReturn{
        String print();
    }
}
