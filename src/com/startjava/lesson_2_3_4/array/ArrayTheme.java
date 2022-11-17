package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Реверс значений массива");
        int[] numbers1 = {5, 3, 1, 7, 2, 8, 4};
        int length = numbers1.length;
        printIntArray(numbers1);
        System.out.println();

        for (int i = 0; i < length; i++) {
            int temp = numbers1[i];
            numbers1[i] = numbers1[--length];
            numbers1[length] = temp;
        }
        printIntArray(numbers1);
        System.out.println();

        System.out.println("\n2. Вывод произведения элементов массива");
        length = 10;
        int[] numbers2 = new int[length];
        int result = 1;

        for (int i = 0; i < length; i++) {
            numbers2[i] = i;
        }

        for (int i = 1; i < length - 1; i++) {
            System.out.print(numbers2[i] + (numbers2[i] == 8 ? " = " : " + "));
            result *= numbers2[i];
        }
        System.out.println(result);
        System.out.printf("Число %d имеет индекс массива %d%n", 0, numbers2[0]);
        System.out.printf("Число %d имеет индекс массива %d%n", 9, numbers2[length - 1]);

        System.out.println("\n3. Удаление элементов массива");
        length = 15;
        double[] numbers3 = new double[length];

        for (int i = 0; i < length - 1; i++) {
            numbers3[i] = Math.random();
        }
        printDoubleArray(numbers3);
        System.out.println();

        double midCell = numbers3[length / 2];
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            if (numbers3[i] > midCell) {
                numbers3[i] = 0;
                count++;
            }
        }
        printDoubleArray(numbers3);
        System.out.println();
        System.out.println("\nКоличество обнуленных ячеек = " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        length = 26;
        char[] alphabet = new char[length];

        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        count = length;
        for (int i = 0; i < length; i++) {
            for (int j = length; j >= count; --j) {
                System.out.print(alphabet[j - 1]);
            }
            --count;
            System.out.println();
        }

        System.out.println("\n5. Вывод элементов массива лесенкой в обратном порядке");
        length = 30;
        int randomNum;
        int[] uniqueNumbers = new int[length];

        for (int i = 0; i < length;) {
            randomNum = (int) (Math.random() * 40 + 60);
            int j;
            for (j = 0; j < i; j++) {
                if(randomNum == uniqueNumbers[j]) break;
            }
            if (i == j) {
                uniqueNumbers[i] = randomNum;
                i++;
            }
        }

        for (int i = uniqueNumbers.length - 1; i > 0; --i) {
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int temp = uniqueNumbers[j];
                    uniqueNumbers[j] = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = temp;
                }
            }
        }

        for (int i = 1; i < uniqueNumbers.length + 1; i++) {
            System.out.printf("%2d ", uniqueNumbers[i - 1]);
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        length = 0;
        count = 0;
        String[] arraySource = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        printStringArray(arraySource);
        System.out.println();

        for (String string : arraySource) {
            if (!string.isBlank()) {
                length++;
            }
        }
        String[] arrayDestination = new String[length];

        for (int i = 0; i < arraySource.length; i++) {
            if (!arraySource[i].isBlank()) {
                System.arraycopy(arraySource, i, arrayDestination, count, 1);
                count++;
            }
        }
        printStringArray(arrayDestination);
    }

    private static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void printDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f ", arr[i]);
            if (i == arr.length / 2) {
                System.out.println();
            }
        }
    }

    private static void printStringArray(String[] arr) {
        for (String string : arr) {
            System.out.print(string + " ");
        }
    }
}
