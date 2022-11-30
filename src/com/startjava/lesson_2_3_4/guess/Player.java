package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Player {
    private final String name;
    private final int[] enteredNumbers;
    private int attempt;
    private int numberOfWins;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return enteredNumbers[attempt - 1];
    }

    public void addNumber(int number) {
        if (number > 0 && number < 100) {
            enteredNumbers[attempt++] = number;
        } else {
            throw new InputMismatchException();
        }
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public boolean hasAttempts() {
        return attempt < enteredNumbers.length;
    }

    public void clearAttempts() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getWin() {
        return numberOfWins;
    }

    public void incWin() {
        numberOfWins++;
    }

    public void resetWin() {
        numberOfWins = 0;
    }
}