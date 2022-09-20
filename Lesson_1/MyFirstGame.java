public class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 49;
         int playerNum = 0;
        int startRange = 1;
        int endRange = 100;
        while (playerNum != compNum) {
            playerNum = (startRange + endRange) / 2;
            if (playerNum < compNum) {
                startRange = playerNum + 1;
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            } else if (playerNum > compNum) {
                endRange = playerNum - 1;
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            }
        }
        System.out.println(playerNum + " Вы победили!");
    }
}
