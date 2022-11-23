package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] enteredNumbers;
    private int attempts;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number < 0 || number > 100) {
            System.out.println("Некорректное число\n");
        } else {
            enteredNumbers[attempts++] = number;
        }
    }

    public int getNumber() {
        return enteredNumbers[attempts - 1];
    }

    public int getAttempts() {
        return attempts;
    }
    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempts);
    }
    public void clearAttempts() {
        Arrays.fill(enteredNumbers, 0, attempts, 0);
        attempts = 0;
    }
}
1