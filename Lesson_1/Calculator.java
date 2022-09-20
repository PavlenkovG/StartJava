public class Calculator {
    public static void main(String[] args) {
        int num1 = 57;
        int num2 = 4;
        int result = 1;
        char mathOperator = '+';
        if (mathOperator == '+') {
            result = num1 + num2;
        } else if (mathOperator == '-') {
            result = num1 - num2;
        } else if (mathOperator == '*') {
            result = num1 * num2;
        } else if (mathOperator == '-') {
            result = num1 * num2;
        } else if (mathOperator == '/') {
            result = num1 / num2;
        } else if (mathOperator == '^') {
            for (int i = 1; i <= num2; i++) {
                result = result * num1;
            }
        } else if (mathOperator == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Введен недопустимый математический оператор.");
            System.out.println("Выберете один из допустимых: + - * / ^ %");
        }
        System.out.println("Результат операции |" + mathOperator + "|" + " чисел " + num1 + 
                    " и " + num2 + " равен " + result);
    }
}
