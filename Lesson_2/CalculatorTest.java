import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calc1.setA(num1);
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            calc1.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calc1.setB(num2);
            calc1.calculate();
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Введите yes или no ");
                answer = scanner.nextLine();
            }
        } 
    }
}