package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] enteredNumbers;
    private int attempt;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number < 0 || number > 100) {
            System.out.println("Некорректное число.\n");
        } else {
            enteredNumbers[attempt++] = number;
        }
    }

    public int getNumber() {
        return enteredNumbers[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    public void clearAttempts() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
        attempt = 0;
    }
}
