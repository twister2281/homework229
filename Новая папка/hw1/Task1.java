import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим основание системы счисления k и число n
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        // Конвертация из k-ичной системы в десятичную
        int result = 0;
        int multiplier = 1;
        
        while (n > 0) {
            int digit = n % 10;
            result += digit * multiplier;
            multiplier *= k;
            n /= 10;
        }

        System.out.println("Число в десятичной системе: " + result);
    }
}

