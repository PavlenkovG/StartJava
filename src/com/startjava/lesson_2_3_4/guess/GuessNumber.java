package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessNumber {
    private final Player[] players;
    private int secretNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        drawLots();
        for (Player player : players) {
            player.resetWin();
        }
        int LIMIT_ROUND = 3;
        for (int round = 0; round < LIMIT_ROUND; round++) {
            startRound();
            if (round < LIMIT_ROUND - 1) {
                System.out.println("Следующий раунд ");
            }
        }
        showWinners();
    }

    private void drawLots() {
        for (int i = players.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Player tmp = players[j];
            players[j] = players[i];
            players[i] = tmp;
        }
    }

    private void startRound() {
        for (Player player : players) {
            player.clearAttempts();
        }
        secretNumber = (int) (Math.random() * 100 + 1);

        boolean endRound = false;
        while (!endRound) {
            for (Player player : players) {
                if (!endRound && player.hasAttempts()) {
                    if (isGuessed(player)) {
                        player.incWin();
                        endRound = true;
                    }
                } else {
                    endRound = true;
                }
            }
        }
        for (Player player : players) {
            printEnteredNumbers(player);
        }
    }

    private boolean isGuessed(Player player) {
        System.out.println("Очередь игрока: " + player.getName());
        System.out.print("Введите число от 1 до 100 : ");
        Scanner scanner = new Scanner(System.in);
        enterNumber(player, scanner);

        int answer = player.getNumber();
        String comparisonResult = answer > secretNumber ? " больше" : " меньше";
        if (answer == secretNumber) {
            System.out.println("Игрок " + player.getName() + ", угадал число " + secretNumber + " c "
                    + player.getAttempt() + " попытки.");
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер\n", answer, comparisonResult);
        if (!player.hasAttempts()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void enterNumber(Player player, Scanner scanner) {
        while (true) {
            try {
                player.addNumber(scanner.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.err.printf("Игрок %s ввел некорректное значение\n", player.getName());
                System.err.printf("'%s'\n Введите число  в интервале  от 1 до 100 : ", scanner.next());
            }
        }
    }

    private void printEnteredNumbers(Player player) {
        System.out.print("Числа игрока " + player.getName() + " : ");
        for (int num : player.getEnteredNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void showWinners(){
        int maxWin = 0;
        for (Player player : players) {
            if (player.getWin() > maxWin) {
                maxWin = player.getWin();
            }
        }
        System.out.println();
        for (Player player : players) {
            if (player.getWin() == maxWin) {
                System.out.println("Игрок " + player.getName() +
                        " победил в " + maxWin + " раундах в игре");
            }
        }
    }
}