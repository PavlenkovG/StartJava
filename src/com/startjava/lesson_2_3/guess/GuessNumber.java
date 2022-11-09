package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;

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
            currentPlayer.setNumber(num);
            if (currentPlayer.getNumber() > secretNum) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        " больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < secretNum) {
                System.out.println("Число " + currentPlayer.getNumber() +
                        " меньше того, что загадал компьютер");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;

        }
        System.out.println(currentPlayer.getName() +", Вы угадали!!! Компьютер загадал:  " + num);
    }
}