package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String expression) {
        String[] splitExpression = expression.split(" ");
        int a = Integer.parseInt(splitExpression[0]);
        int b = Integer.parseInt(splitExpression[2]);
        String sign = splitExpression[1];
        int result = 1;
        switch(sign) {
            case "+" :
                result = a + b;
                break;
            case "-" :
                result = a - b;
                break;
            case "*" :
                result = a * b;
                break;
            case "/" :
                result = a / b;
                break;
            case "^" :
                result = (int) Math.pow(a, b);
                break;
            case "%" :
                result = a % b;
                break;
            default : System.out.println("Введен недопустимый математический оператор.\n" +
                    "Выберете один из допустимых: + - * / ^ %");
        }
        return result;
    }
}