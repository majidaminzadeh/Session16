package com.tosan.example4;

public class Example4 {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            private int index;
            @Override
            public void print() {
                int index = 0;
                this.index++;
                System.out.println("Test" + index);
            }
            public void print2(){
                System.out.println("Anonymous class default method");
            }
        };

        myInterface.print2();

        MyInterface myInterface1 = () -> {
            int index = 0;
            System.out.println("Test");
        };
        myInterface1.print2();;
    }

    interface MyInterface{
        void print();
        default void print2(){
            System.out.println("Default method");
        }
    }
}

