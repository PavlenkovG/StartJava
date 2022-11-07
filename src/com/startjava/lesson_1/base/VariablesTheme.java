package com.startjava.src.com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        boolean testSys;
        char cpuSeries = 'i';
        byte osVersion = 10;
        double osBuildVersion = 19043.1874;
        short coresNumber = 8;
        float cpuSpeed = 3.51f;
        int totalPhysicalMemory = 8144;
        long localDiskSpace = 474484228;
        System.out.println("Характеристики рабочего ПК:\n ОС Windows версии " +
                osVersion + ", сборка версии " + osBuildVersion + ".\n Процессор серии " +
                cpuSeries + "5 с " + coresNumber + " ядрами и тактовой частотой " + 
                cpuSpeed + " Ghz. \nОбъем ОЗУ " + totalPhysicalMemory + 
                " MB. \nОбъем локального диска " + localDiskSpace + " KB.");

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int percentageDiscount = 11;
        int totalPrice = penPrice + bookPrice;
        int discount = totalPrice / 100 * percentageDiscount;
        int discountPrice = totalPrice - discount ;
        System.out.println("Сумма скидки: " + discount + "руб\nОбщая стоимость товаров со скидкой: "
                 + discountPrice + "руб");

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a   \n   J   a a  v   v  a a  \n" + 
                "J  J  aaaaa  V V  aaaaa \n JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte bMax = 127;
        short sMax = 32767;
        int iMax = 2147483647;
        long lMax = 9223372036854775807l;
        System.out.println("Максимальное значение переменной Byte = " + bMax +
                "\nзначение после инкремента = " + ++bMax + "\n значение после декремента = "
                 + --bMax);
        System.out.println("Максимальное значение переменной Short = " + sMax +
                "\nзначение после инкремента = " + ++sMax + "\n значение после декремента = "
                 + --sMax);
        System.out.println("Максимальное значение переменной Int = " + iMax +
                "\nзначение после инкремента = " + ++iMax + "\n значение после декремента = "
                 + --iMax);
        System.out.println("Максимальное значение переменной Long = " + lMax +
                "\nзначение после инкремента = " + ++lMax + "\n значение после декремента = "
                 + --lMax);

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        int temp = num1;
        System.out.println("Перестановка с помощью дополнительной переменной");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num2;
        num2 = temp;
        System.out.println("Новое значение переменных:  num1 = " + num1 + ", num2 = " + num2 + '\n');
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 += num2;
        num2 -= num2;
        num1 -= num2;
        System.out.println("Новое значение переменных:  num1 = " + num1 + ", num2 = " + num2 + '\n');
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новое значение переменных:  num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char chr35 = '#';
        char chr38 = '&';
        char chr64 = '@';
        char chr94 = '^';
        char chr95 = '_';
        System.out.println("Коду " + (int) chr35 + " соответствует символ ASCII-таблицы " + chr35);
        System.out.println("Коду " + (int) chr38 + " соответствует символ ASCII-таблицы " + chr38);
        System.out.println("Коду " + (int) chr64 + " соответствует символ ASCII-таблицы " + chr64);
        System.out.println("Коду " + (int) chr94 + " соответствует символ ASCII-таблицы " + chr94);
        System.out.println("Коду " + (int) chr95 + " соответствует символ ASCII-таблицы " + chr95);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        System.out.println("Число N содержит: ");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underscore + openBracket + space
                + closeBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space
                + space + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore
                + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        num = 365;
        int digit1 = num / 100;
        int digit2 = (num % 100) / 10;
        int digit3 = num % 10;
        int sumDigits = digit1 + digit2 + digit3;
        System.out.println("Сумма цифр числа N = " + sumDigits);
        System.out.println("Произведение цифр числа N = " + digit1 * digit2 * digit3);

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hour = totalSeconds % 24;
        int minute = (totalSeconds / 24) / 60;
        int second = totalSeconds % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}