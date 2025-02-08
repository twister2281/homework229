import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Создаём объект Scanner для получения ввода от пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество чисел в последовательности
        System.out.println("Введите длину последовательности:");
        int n = scanner.nextInt();

        // Проверка, что последовательность состоит хотя бы из 3 чисел
        if (n < 3) {
            System.out.println("Последовательность должна быть длиной не менее 3.");
            return;
        }

        // Массив для хранения чисел
        int[] numbers = new int[n];

        // Запрашиваем числа последовательности
        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Переменная для подсчёта чётных локальных максимумов
        int evenLocalMaxCount = 0;

        // Проверяем локальные максимумы в последовательности
        for (int i = 1; i < n - 1; i++) {
            // Условие для локального максимума (больше соседних и чётное)
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1] && numbers[i] % 2 == 0) {
                evenLocalMaxCount++;
            }
        }

        // Выводим результат в зависимости от количества чётных локальных максимумов
        if (evenLocalMaxCount == 2) {
            System.out.println("Ровно два чётных локальных максимума существуют.");
        } else {
            System.out.println("Чётных локальных максимумов не ровно два.");
        }
    }
}
