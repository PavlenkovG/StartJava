package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(splitExpression[0]);
            b = Integer.parseInt(splitExpression[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Недопустимон значение. Введите корректное значение");
            return 0;
        }
        try {
            if (a < 0 || b < 0) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Числа не могут быть отрицательными");
            return 0;
        }

        String sign = splitExpression[1];
        int result = switch (sign) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            case "^" -> result = (int) Math.pow(a, b);
            case "%" -> result = a % b;
            default -> {
                System.out.println("Не корректный математический оператор\n");
                yield 0;
            }
        };
        return result;
    }
}