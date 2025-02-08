import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Создаём объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем действительное число a
        System.out.println("Введите действительное число a:");
        double a = scanner.nextDouble();

        // Запрашиваем натуральное число n
        System.out.println("Введите натуральное число n:");
        int n = scanner.nextInt();

        // Проверка: n должно быть положительным числом, а a не должно быть равно нулю
        if (n <= 0 || a == 0) {
            System.out.println("Ошибка: n должно быть натуральным числом, а a не должно быть равно нулю.");
            return; // Завершаем программу, если входные данные некорректны
        }

        // Переменная для хранения суммы
        double sum = 0;

        // Вычисляем сумму по заданной формуле
        for (int i = 1; i <= n; i++) {
            // В каждой итерации добавляем 1 / (a ^ (2 ^ (i-1))) в сумму
            sum += 1 / Math.pow(a, Math.pow(2, i - 1));
        }

        // Выводим результат
        System.out.println("Результат: " + sum);
    }
}
