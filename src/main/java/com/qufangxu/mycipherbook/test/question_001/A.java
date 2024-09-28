package com.qufangxu.mycipherbook.test.question_001;

public class A extends B {
    static {
        System.out.println("LOAD A");
    }

    public A() {
        System.out.println("CREATE A");
    }

    public static void main(String[] args) {
        new A();
        /*
        LOAD B
        LOAD A
        CREATE B
        CREATE A
        */
    }
}
