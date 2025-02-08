import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();

        if (a == b) {
            System.out.println("Числа равны.");
        } else {
            System.out.println("Числа не равны.");
        }
    }
}
