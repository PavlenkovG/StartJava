package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calc.setA(num1);
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calc.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calc.setB(num2);
            calc.calculate();
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Введите yes или no ");
                answer = scanner.nextLine();
            }
        } 
    }
}