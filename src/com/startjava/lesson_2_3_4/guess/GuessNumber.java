package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random rnd = new Random();
        int secretNum = rnd.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        Player currentPlayer = player1;

        while (secretNum != num) {
            System.out.println(currentPlayer.getName() + ", введите число от 1 до 100");
            num = scanner.nextInt();
            currentPlayer.addNumber(num);
            if (currentPlayer.getNumber() > secretNum) {
                System.out.println("Число " + currentPlayer.getNumber() +
                        " больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < secretNum) {
                System.out.println("Число " + currentPlayer.getNumber() +
                        " меньше того, что загадал компьютер");
            }
            if(currentPlayer.getAttempts() == 10) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки.");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;

        }
        System.out.println("Игрок " + currentPlayer.getName() + ", угадал число " + num + " c "
                + currentPlayer.getAttempts() + " попытки.");
        printEnteredNumbers(player1);
        printEnteredNumbers(player2);
        player1.clearAttempts();
        player2.clearAttempts();
    }

    public void printEnteredNumbers(Player pl) {
        int[] nums = pl.getEnteredNumbers();
        System.out.print("Числа игрока " + pl.getName() + " : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}




