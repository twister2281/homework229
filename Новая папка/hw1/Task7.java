import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим число n
        int n = scanner.nextInt();

        // Считаем количество цифр в числе n
        int numDigits = Integer.toString(n).length();
        System.out.println("a) Количество цифр в числе n: " + numDigits);

        // Считаем сумму цифр числа n
        int sumDigits = 0;
        int temp = n;
        while (temp > 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }
        System.out.println("b) Сумма цифр числа n: " + sumDigits);

        // Первая цифра числа n
        int firstDigit = Integer.toString(n).charAt(0) - '0';
        System.out.println("c) Первая цифра числа n: " + firstDigit);

        // Если n >= 10, находим предпоследнюю цифру
        if (n >= 10) {
            int secondLastDigit = (n / 10) % 10;
            System.out.println("d) Предпоследняя цифра числа n: " + secondLastDigit);
        }
    }
}
//1