import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное целое число:");
        int number = scanner.nextInt();

        String binary = "";
        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }

        System.out.println("Двоичное представление: " + binary);
    }
}
