public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 31;
        if (age > 20) {
            System.out.println("Старше 20");
        } else {
            System.out.println("Младше 20 или 20");
        }

        boolean male = true;
        if (!male) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        double height = 1.77;
        if (height < 1.80) {
            System.out.println("Рост менее или равен 1.8 м");
        } else {
            System.out.println("Рост более 1.8 м");
        }

        char firstLetterOfName = "Grigoriy".charAt(0);
        if(firstLetterOfName == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени " + firstLetterOfName);
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 257;
        int num2 = 162;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " max, а число " + num2 + " min");
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " max, а число " + num1 + " min");
        } else {
            System.out.println("Число " + num1 + " и число " + num2 + " равны");
        }

        System.out.println("\n3. Работа с числом\n");
        int num = -51;
        System.out.println("Число " + num);
        if (num == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (num % 2 == 0) {
                System.out.println("Число является четным");
            } else {
                System.out.println("Число является нечетным");
            } if (num > 0) {
                System.out.println("Число является положительным");
            } else {
                System.out.println("Число является отрицательным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 531;
        num2 = 581;
        int hundreds1 = num1 / 100;
        int tens1 = (num1 % 100) / 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = (num2 % 100) / 10;
        int ones2 = num2 % 10;
        System.out.println("Первое число = " + num1 + " второе число = " + num2);
        if (hundreds1 == hundreds2) {
            System.out.println("цифры в сотнях равны (" + hundreds1 + ")");
        }
        if (tens1 == tens2) {
            System.out.println("цифры в десятках равны (" + tens1 + ")");
        }
        if (ones1 == ones2) {
            System.out.println("цифры в единицах равны (" + ones1 + ")");
        } else {
            System.out.println("Одинаковых чисел, стоящих в одном и том же разряде - нет");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - маленькая буква.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - большая буква.");
        } else if (symbol >= 0 && symbol <=9 ) {
            System.out.println(symbol + " - число.");
        } else {
            System.out.println(symbol + " - не буква и не число.");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int deposit = 300_000;
        byte annualInterest;
        if (deposit < 100_000) {
            annualInterest = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            annualInterest = 7;
        } else {
            annualInterest = 10;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + (deposit * annualInterest / 100));
        System.out.println("Итоговая сумма с %: " + (deposit + deposit * annualInterest / 100));

        System.out.println("\n7. Определение оценки по предметам\n");
        byte subjHistory = 59;
        byte subjProgramming = 91;
        byte scrHistory;
        byte scrProgramming;
        if (subjHistory <= 60) {
            scrHistory = 2;
        } else if (subjHistory > 60) {
            scrHistory = 3;
        } else if (subjHistory > 73) {
            scrHistory = 4;
        } else {
            scrHistory = 5;
        }
        if (subjProgramming <= 60) {
            scrProgramming = 2;
        } else if (subjProgramming > 60) {
            scrProgramming = 3;
        } else if (subjProgramming > 73) {
            scrProgramming = 4;
        } else {
            scrProgramming = 5;
        }
        System.out.println(scrHistory + " оценка по истории");
        System.out.println(scrProgramming + " оценка по программированию");
        System.out.println((scrHistory + scrProgramming / 2) + " средний балл оценок по предметам");
        System.out.println((subjHistory + subjProgramming / 2) + " средний % по предметам");

        System.out.println("\n8. Расчет прибыли\n");
        int rentPerMonth = 5000;
        int earnPerMonth = 13000;
        int productionPrice = 9000;
        int annualProfit = (earnPerMonth - rentPerMonth - productionPrice) * 12;
        if (annualProfit > 0) {
            System.out.println("+" + annualProfit + " прибыль за год");
        } else {
            System.out.println(annualProfit + " прибыль за год");
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int withdrawAmount = 567;
        int availableTens = 5;
        int hundreds = withdrawAmount / 100;
        int tens = (withdrawAmount / 10) % 10;
        int ones = withdrawAmount % 10;

        if (tens > availableTens) {
            ones += (tens - availableTens) * 10;
            tens = availableTens;
        }
        System.out.print("Номиналы банкнот: 100, 10 , 1\n");
        System.out.print("Требуемое их количество:\n 100 - " + hundreds + " шт." +
                "\n 10 - " + tens + " шт." + "\n 1 - " + ones + " шт."); 
        System.out.println("\nПосчитанная исходная сумма: " + (100 * hundreds + 10 * tens + ones));
    }
}
