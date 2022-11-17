package com.startjava.lesson_2_3_4.person;

public class Person {
    
    String gender = "male";
    String name = "Paul";
    float height = 1.88f;
    int weight = 85;
    int age = 31;

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("sitting");
    }

    void run() {
        System.out.println("running");
    }
    
    String speak() {
        return "Hi!";
    }

    boolean learnJava() {
        return true;
    }
}