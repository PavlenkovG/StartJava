public class VariablesTheme {
    public static void main(String[] args) {
        boolean testSys;
        char cpuSeries = 'i';
        byte osVersion = 10;
        double osBuildVersion = 19043.1874;
        short coresNumber = 8;
        float cpuSpeed = 3.51f;
        int totalPhysicalMemory = 8144;
        long localDiskSpace = 474484228;

        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        System.out.println("Характиристики рабочего ПК:\n ОС Windows версии " +
                osVersion + ", сборка версии " + osBuildVersion + ".\n Процессор серии " +
                cpuSeries + "5 с " + coresNumber + " ядрами и тактовой частотой " + 
                cpuSpeed + " Ghz. \nОбъем ОЗУ " + totalPhysicalMemory + 
                " MB. \nОбъем локального диска " + localDiskSpace + " KB.");

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int penCost = 100;
        int bookCost = 200;
        int percentageDiscount = 11;
        int totalPrice = penCost + bookCost;
        int discount = totalPrice / 100 * 11;
        int discountPrice =totalPrice - discount ;
        System.out.println("Сумма скидки: " + discount + "руб\nОбщая стоимость товаров со скидкой: "
                 + discountPrice + "руб");

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a   \n   J   a a  v   v  a a  \n" + 
                "J  J  aaaaa  V V  aaaaa \n JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte bMax =127;
        short sMax = 32767;
        int iMax = 2147483647;
        long lMax = 9223372036854775807l;
        byte  incBMax = ++bMax;
        byte  decBMax = --bMax;
        short incSMax = ++sMax;
        short decSMax = --sMax;
        int incIMax = ++iMax;
        int decIMax = --iMax;
        long incLMax = ++lMax;
        long decLMax = --lMax;

        System.out.println("Максимальное значение переменной Byte = " + bMax +
                "\nзначение после инкремента = " + incBMax + "\n значение после декремента = "
                 + decBMax);
        System.out.println("Максимальное значение переменной Short = " + sMax +
                "\nзначение после инкремента = " + incSMax + "\n значение после декремента = "
                 + decSMax);
        System.out.println("Максимальное значение переменной Int = " + iMax +
                "\nзначение после инкремента = " + incIMax + "\n значение после декремента = "
                 + decIMax);
        System.out.println("Максимальное значение переменной Long = " + lMax +
                "\nзначение после инкремента = " + incLMax + "\n значение после декремента = "
                 + decLMax);

        System.out.println("\n5. Перестановка значений переменных\n");
        int i = 2;
        int k = 5;
        int temp = i;
        System.out.println("Перестановка с помощью дополнтельной переменной");
        System.out.println("Исходнные значения переменных: i = " + i + ", k = " + k);
        i = k;
        k = temp;
        System.out.println("Новое значение переменных:  i = " + i + ", k = " + k + '\n');
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходнные значения переменных: i = " + i + ", k = " + k);
        i = i + k;
        k = i - k;
        i = i - k;
        System.out.println("Новое значение переменных:  i = " + i + ", k = " + k + '\n');
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходнные значения переменных: i = " + i + ", k = " + k);
        i = i ^ k;
        k = k ^ i;
        i = i ^ k;
        System.out.println("Новое значение переменных:  i = " + i + ", k = " + k);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char chr35 = '#';
        char chr38 = '&';
        char chr64 = '@';
        char chr94 = '^';
        char chr95 = '_';
        int code35 = '#';
        int code38 = '&';
        int code64 = '@';
        int code94 = '^';
        int code95 = '_';
        System.out.println("Коду " + code35 + " соответствует символ ASCII-таблицы " + chr35);
        System.out.println("Коду " + code38 + " соответствует символ ASCII-таблицы " + chr38);
        System.out.println("Коду " + code64 + " соответствует символ ASCII-таблицы " + chr64);
        System.out.println("Коду " + code94 + " соответствует символ ASCII-таблицы " + chr94);
        System.out.println("Коду " + code95 + " соответствует символ ASCII-таблицы " + chr95);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        num %= 100;
        int tens = num / 10;
        int units = num % 10;
        System.out.println("Число N содержит: ");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(units + " единиц");

         System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char ch1 = ' ';
        char ch2 = '/';
        char ch3 = '\\';
        char ch4 = '_';
        char ch5 = '(';
        char ch6 = ')';
        System.out.println(ch1 + "" + ch1 + "" + ch1 + "" + ch1+ "" + ch2 + "" + ch3+ "" + 
                ch1 + "" + ch1 + "" + ch1 + "" + ch1);
        System.out.println(ch1 + "" + ch1 + "" + ch1 + "" + ch2+ "" + ch1 + "" + ch1+ "" + 
                ch3 + "" + ch1 + "" + ch1 + "" + ch1);
        System.out.println(ch1 + "" + ch1 + "" + ch2 + "" + ch4+ "" + ch5 + "" + ch1+ "" + 
                ch6 + "" + ch3 + "" + ch1 + "" + ch1);
        System.out.println(ch1 + "" + ch2 + "" + ch1 + "" + ch1+ "" + ch1 + "" + ch1+ "" + 
                ch1 + "" + ch1 + "" + ch3 + "" + ch1);
        System.out.println(ch2 + "" + ch4 + "" + ch4 + "" + ch4+ "" + ch4 + "" + ch2+ "" + 
                ch3 + "" + ch4 + "" + ch4 + "" + ch3);

        System.out.println("\n9. Произведение и сумма цифр числа");
        num = 365;
        int digit1 = num / 100;
        num %= 100;
        int digit2 = num / 10;
        int digit3 = num % 10;
        int sumDigit = digit1 + digit2 + digit3;
        System.out.println("Сумма цифр числа N = " + sumDigit);
        System.out.println("Произведение цифр числа N = " + digit1 * digit2 * digit3);

        System.out.println("\n10. Преобразование секунд");
        int secNum = 86399;
        int hour = secNum / 3600;
        secNum %= 3600;
        int minute = secNum / 60;
        int second = secNum % 60;
        System.out.println(hour + ":" + minute + ":" + second);
        }
}