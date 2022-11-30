package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива.");
        int[] numbers1 = {5, 3, 1, 7, 2, 8, 4};
        int length = numbers1.length;
        printIntArray(numbers1);

        for (int i = 0; i < length; i++) {
            int temp = numbers1[i];
            numbers1[i] = numbers1[--length];
            numbers1[length] = temp;
        }
        printIntArray(numbers1);

        System.out.println("\n2. Вывод произведения элементов массива");
        length = 10;
        int[] numbers2 = new int[length];

        int prod = 1;
        for (int i = 0; i < length; i++) {
            numbers2[i] = i;
        }

        for (int i = 1; i < length - 1; i++) {
            System.out.print(numbers2[i] + (i != length - 2 ? " * " : " = "));
            prod *= numbers2[i];
        }
        System.out.println(prod);
        System.out.printf("Число %d имеет индекс массива %d%n", 0, numbers2[0]);
        System.out.printf("Число %d имеет индекс массива %d%n", 9, numbers2[length - 1]);

        System.out.println("\n3. Удаление элементов массива");
        length = 15;
        double[] numbers3 = new double[length];

        for (int i = 0; i < length; i++) {
            numbers3[i] = Math.random();
        }
        printDoubleArray(numbers3);

        double middleNumber = numbers3[length / 2];
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            if (numbers3[i] > middleNumber) {
                numbers3[i] = 0;
                count++;
            }
        }
        printDoubleArray(numbers3);
        System.out.println("\nКоличество обнуленных ячеек = " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        length = 26;
        char[] alphabet = new char[length];

        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        count = length;
        for (int i = 0; i < length; i++) {
            for (int j = length; j >= count; j--) {
                System.out.print(alphabet[j - 1]);
            }
            --count;
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        length = 30;
        int[] uniqueNumbers = new int[length];

        for (int i = 0; i < length;) {
            int randomNum = (int) (Math.random() * 40 + 60);
            int j;
            for (j = 0; j < i; j++) {
                if(randomNum == uniqueNumbers[j]) break;
            }
            if (i == j) {
                uniqueNumbers[i] = randomNum;
                i++;
            }
        }

        for (int i = length - 1; i > 0; i--) {
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
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        printStringArray(srcArray);
        System.out.println();

        for (String string : srcArray) {
            if (!string.isBlank()) {
                length++;
            }
        }

        String[] destArray = new String[length];
        int scrPos = 0;
        int destPos = 0;
        length = 0;
        for (int i = 0; i < srcArray.length; i++) {
            if (!srcArray[i].isBlank()) {
                length++;
            } else {
                System.arraycopy(srcArray, scrPos, destArray, destPos, length);
                destPos += length;
                length = 0;
                scrPos = i + 1;
            }
        }
        printStringArray(destArray);
    }

    private static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f ", arr[i]);
            if (i == arr.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStringArray(String[] arr) {
        for (String string : arr) {
            System.out.print(string + " ");
        }
    }
}
