package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра - Угадай число!");
        System.out.println("У каждого игрока по 10 попыток.");
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createNewPlayers(scanner));

        String answer = "yes";
        do {
            if("yes".equals(answer)) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }

    public static Player[] createNewPlayers(Scanner scanner){
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.printf("Введите имя игрока %d : ", i + 1);
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}
