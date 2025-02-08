import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Создаём объект Scanner для получения ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество чисел в последовательности
        System.out.println("Введите количество чисел n:");
        int n = scanner.nextInt();

        // Массив для хранения чисел
        double[] numbers = new double[n];

        // Запрашиваем последовательность чисел
        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Изменяем числа в последовательности в зависимости от их знака
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                // Если число отрицательное, увеличиваем его на 0.5
                numbers[i] += 0.5;
            } else {
                // Если число положительное или ноль, присваиваем ему значение 0.1
                numbers[i] = 0.1;
            }
        }

        // Выводим изменённую последовательность
        System.out.println("Изменённая последовательность:");
        for (double num : numbers) {
            // Выводим каждый элемент через пробел
            System.out.print(num + " ");
        }
    }
}
