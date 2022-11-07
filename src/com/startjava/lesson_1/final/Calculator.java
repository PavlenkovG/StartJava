package com.startjava.src.com.startjava.lesson_1.fin;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int result = 1;
        char sign = '^';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '-') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            for (int i = 1; i <= b; i++) {
                result*= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Введен недопустимый математический оператор.\n" +
                    "Выберете один из допустимых: + - * / ^ %");
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}