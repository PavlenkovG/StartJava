package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeg1 = new Jaeger();
        jaeg1.setModelName("Striker Eureka");
        jaeg1.setMark("Mark-5");
        jaeg1.setOrigin("Australia");
        jaeg1.setHeight(76.2f);
        jaeg1.setWeight(1.85f);
        jaeg1.setStrength(10);
        jaeg1.setArmor(9);

        Jaeger jaeg2 = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 10, 10);

        System.out.println("First Jaeger - " + jaeg1.getModelName() + ". Second Jaeger - " +
                jaeg2.getModelName() + ".");
        System.out.println("Mark first Jaeger - " + jaeg1.getMark() + ". Mark second Jaeger - " +
                jaeg2.getMark() + ".");
        System.out.println("Origin first Jaeger - " + jaeg1.getOrigin() +
                ". origin second Jaeger - " + jaeg2.getOrigin() + ".");
        System.out.println("Height first Jaeger - " + jaeg1.getHeight() +
                "m. height second Jaeger - " + jaeg2.getHeight() + "m.");
        System.out.println("Weight first Jaeger - " + jaeg1.getWeight() +
                "t. weight second Jaeger - " + jaeg2.getWeight() + "t.");
        System.out.println("Strength first Jaeger - " + jaeg1.getStrength() +
                ". strength second Jaeger - " + jaeg2.getStrength() + ".");
        System.out.println("Armor first Jaeger - " + jaeg1.getArmor() +
                ". armor second Jaeger - " + jaeg2.getArmor() + ".");

        System.out.print("\nFirst Jaeger "); 
        jaeg1.move();
        System.out.print("\nSecond Jaeger " );
        jaeg2.scanKaiju();
        System.out.print("\nFirst Jaeger ");
        jaeg1.useVortexCannon();
    }
}