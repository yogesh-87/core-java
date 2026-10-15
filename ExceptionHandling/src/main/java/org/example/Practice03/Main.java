package org.example.Practice03;

public class Main {


    public static void methodA () {
        try {
            methodB();
        } catch (NumberFormatException e) {
            System.out.println("Handled Exception In MethodA:" + e.getMessage());
        }
    }

    public static void methodB () {
        methodC();
    }

    public static void methodC () {
        int number = Integer.parseInt("abc");
        System.out.println("This line will never print: " + number);
    }
    public static void main(String[] args) {
        methodA();


    }

}
