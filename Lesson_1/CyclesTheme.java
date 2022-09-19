public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while (num <= 21);
        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d%n",
                sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (num3 < min) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке = ");
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sumDigits += digit;
            num /= 10;
        }
        System.out.print(" и сумму его цифр = " + sumDigits);

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк.");
        int numInLine = 0;
        for (int i = 1; i < 24; i += 2, numInLine++) {
            if (numInLine == 5) {
                System.out.println();
                numInLine = 0;
            }
            System.out.printf("%4d", i);
        }
        for (int i = 0; i < (5 - numInLine % 5); i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность.");
        num = 3141591;
        int numOfDigits = 0;
        System.out.print("Число " + num + " содержит ");
        while (num > 0) {
            if (num % 10 == 1){
                numOfDigits++;
            }
            num /= 10;
        }
        if (numOfDigits % 2 == 0) {
            System.out.println(numOfDigits + " четное количество единиц");
        } else {
            System.out.println(numOfDigits + " нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли.");
        int numOfChrInLine = 10;
        int numOfRows = 5;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfChrInLine; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        numOfChrInLine = 5;
        numOfRows = 5;
        int i = 0;
        int j = 0;
        while (j < numOfRows) {
            while (i < numOfChrInLine) {
                System.out.print("#");
                i++;
            }
            System.out.println();
            j++;
            numOfChrInLine--;
            i = 0;
        }

        System.out.println();
        int currentRow = 1;
        numOfChrInLine = 1;
        num = 0;
        do {
            System.out.print("$");
            num++;
            if (num == numOfChrInLine) {
                if (currentRow < 3) {
                    numOfChrInLine++;
                } else {
                    numOfChrInLine--;
                }
                num = 0;
                currentRow++;
                System.out.println();
            }
        } while (currentRow <= 5);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.printf("%5s%6s%n", "Dex", "Char");
        for (i = 0; i < '0'; i++) {
            if (i % 2 != 0) {
                 System.out.printf("%5d%6c%n", i, i);
            }
        }
        for (i = 'a'; i <= 'z' ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5d%6c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом.");
        num = 1234321;
        int copyNum = num;
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }
        if (copyNum == reverseNum) {
            System.out.printf("Число %d является палиндромом%n", copyNum);
        } else {
            System.out.printf("Число %d не является палиндромом%n", copyNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым.");
        num = 732354;
        int leftDigits = num / 1000;
        int rightDigits = num % 1000;
        int sum1 = 0;
        int sum2 = 0;
        while (leftDigits > 0) {
            sum1 += leftDigits % 10;
            leftDigits /= 10;
            sum2 += rightDigits % 10;
            rightDigits /= 10;
        }
        leftDigits = num / 1000;
        rightDigits = num % 1000;
        System.out.printf("Сумма цифр %d = %d%n", leftDigits, sum1);
        System.out.printf("Сумма цифр %d = %d%n", rightDigits, sum2);
        if (sum1 == sum2) {
            System.out.printf("Число %d является счастливым.%n", num);
        } else {
            System.out.printf("Число %d не является счастливым.%n", num);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print(" |");
        for (i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (i = 1; i < 28; i++) {
            System.out.print('-');
        }
        System.out.println();
        for (i = 2; i <= 9; i++) {
            System.out.printf("%d|", i);
            for (j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}