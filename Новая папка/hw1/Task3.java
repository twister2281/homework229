import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Константа для числа PI
        final double PI = 3.141592653589793;

        // Создаём объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем два целых числа m и n
        System.out.println("Введите два неравных целых числа m и n:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Проверка, что числа m и n не равны
        if (m == n) {
            System.out.println("Числа должны быть неравны.");
            return;
        }

        // Вычисляем дроби m/n и n/m
        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;

        // Сравниваем разницу между дробями и числом PI
        if (Math.abs(fraction1 - PI) < Math.abs(fraction2 - PI)) {
            // Если дробь m/n ближе к PI, увеличиваем m на 10
            m *= 10;
            System.out.println("Дробь m/n ближе к π. Новое значение m: " + m);
        } else {
            // Если дробь n/m ближе к PI, увеличиваем n на 2
            n *= 2;
            System.out.println("Дробь n/m ближе к π. Новое значение n: " + n);
        }
    }
}
