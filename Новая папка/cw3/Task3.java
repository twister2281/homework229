import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Запрашиваем количество элементов последовательности
        System.out.println("Введите количество элементов последовательности (n >= 3): ");
        int n = scanner.nextInt();
        
        // Проверка, что n >= 3
        if (n < 3) {
            System.out.println("Ошибка: n должно быть >= 3");
            return;
        }

        // Инициализация массива для последовательности
        int[] a = new int[n];
        
        // Ввод элементов последовательности
        System.out.println("Введите " + n + " целых чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Инициализация переменных для хранения максимальной и минимальной суммы
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        // Инициализация переменных для индексов чисел с максимальной и минимальной суммой
        int maxPairIndex1 = -1, maxPairIndex2 = -1;
        int minPairIndex1 = -1, minPairIndex2 = -1;

        // Поиск максимальной и минимальной суммы двух соседних чисел
        for (int i = 0; i < n - 1; i++) {
            int sum = a[i] + a[i + 1];

            // Обновляем максимальную сумму, если текущая сумма больше
            if (sum > maxSum) {
                maxSum = sum;
                maxPairIndex1 = i + 1; // Индекс первого числа
                maxPairIndex2 = i + 2; // Индекс второго числа
            }

            // Обновляем минимальную сумму, если текущая сумма меньше или равна
            if (sum <= minSum) { 
                minSum = sum;
                minPairIndex1 = i + 1;
                minPairIndex2 = i + 2;
            }
        }

        // Выводим результаты
        System.out.println("a) Максимальная сумма двух соседних чисел: " + maxSum);
        System.out.println("б) Минимальная сумма двух соседних чисел: " + minSum);
        System.out.println("в) Номера чисел с максимальной суммой: " + maxPairIndex1 + ", " + maxPairIndex2);
        System.out.println("г) Номера чисел с минимальной суммой: " + minPairIndex1 + ", " + minPairIndex2);
    }
}
