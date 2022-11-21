package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String expression = scanner.nextLine();
            System.out.println("Результат = " + calc.calculate(expression));
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Введите yes или no ");
                answer = scanner.nextLine();
            }
        }
    }
}