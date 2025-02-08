import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число k:");
        int k = scanner.nextInt();

        System.out.println("Таблица умножения для числа " + k + ":");
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " × " + k + " = " + (i * k));
        }
    }
}
