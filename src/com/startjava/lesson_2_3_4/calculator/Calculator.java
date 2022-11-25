package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        int a;
        int b;
        try {
            a = Integer.parseInt(splitExpression[0]);
            b = Integer.parseInt(splitExpression[2]);
        } catch (NumberFormatException e) {
            System.out.println("Недопустимое значение. Введите корректное значение");
            return 0;
        }
        try {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Числа не могут быть отрицательными");
            return 0;
        }

        String sign = splitExpression[1];
        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "^" -> (int) Math.pow(a, b);
            case "%" -> a % b;
            default -> {
                System.out.println("Не корректный математический оператор\n");
                yield 0;
            }
        };
    }
}