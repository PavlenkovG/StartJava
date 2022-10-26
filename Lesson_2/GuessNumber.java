import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Random rnd = new Random();
        int setNum = rnd.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        Player currentPlayer = player1;

        while (setNum != num) {
            System.out.println(currentPlayer.getName() + ", введите число от 1 до 100");
            num = scanner.nextInt();
            currentPlayer.setNumber(num);
            if (currentPlayer.getNumber() > setNum) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        " больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < setNum) {
                System.out.println("Число " + currentPlayer.getNumber() +
                        " меньше того, что загадал компьютер");
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        System.out.println(currentPlayer.getName() +", Вы угадали!!! Компьютер загадал:  " + num);
    }
}