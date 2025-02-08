import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Создание массива и подготовка переменных для вычислений
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 5, 7, 9, 2, 4, 6, 8, 1, 10};

        int sum = 0; // Для хранения суммы всех элементов
        int product = 1; // Для хранения произведения всех элементов
        int sumOfSquares = 0; // Для хранения суммы квадратов всех элементов

        // Проходим по всем элементам массива и рассчитываем сумму, произведение и сумму квадратов
        for (int num : array) {
            sum += num; // Суммируем все элементы
            product *= num; // Перемножаем все элементы
            sumOfSquares += num * num; // Суммируем квадраты всех элементов
        }

        // Сумма первых шести элементов
        int sumOfFirstSix = 0;
        for (int i = 0; i < 6; i++) {
            sumOfFirstSix += array[i]; // Суммируем первые шесть элементов массива
        }

        // Ввод значений k1 и k2, определяющих диапазон
        System.out.println("Введите k1 и k2 (k2 > k1): ");
        int k1 = scanner.nextInt() - 1; // Преобразуем индекс k1 к индексу массива (с учетом 0-индексации)
        int k2 = scanner.nextInt() - 1; // Преобразуем индекс k2 к индексу массива (с учетом 0-индексации)
        int rangeSum = 0; // Для хранения суммы элементов в указанном диапазоне
        for (int i = k1; i <= k2; i++) {
            rangeSum += array[i]; // Суммируем элементы от k1 до k2
        }

        // Рассчитываем среднее арифметическое всех элементов массива
        double avg = (double) sum / array.length;

        // Ввод значений s1 и s2 для другого диапазона
        System.out.println("Введите s1 и s2 (s2 > s1): ");
        int s1 = scanner.nextInt() - 1; // Преобразуем индекс s1 к индексу массива (с учетом 0-индексации)
        int s2 = scanner.nextInt() - 1; // Преобразуем индекс s2 к индексу массива (с учетом 0-индексации)
        int subSum = 0; // Для хранения суммы элементов в поддиапазоне
        for (int i = s1; i <= s2; i++) {
            subSum += array[i]; // Суммируем элементы от s1 до s2
        }
        // Рассчитываем среднее арифметическое для поддиапазона
        double subAvg = (double) subSum / (s2 - s1 + 1);

        // Выводим результаты
        System.out.println("a) Сумма всех элементов: " + sum);
        System.out.println("b) Произведение всех элементов: " + product);
        System.out.println("c) Сумма квадратов всех элементов: " + sumOfSquares);
        System.out.println("d) Сумма первых шести элементов: " + sumOfFirstSix);
        System.out.println("e) Сумма с " + (k1 + 1) + "-го по " + (k2 + 1) + "-й элемент: " + rangeSum);
        System.out.println("f) Среднее арифметическое всех элементов: " + avg);
        System.out.println("g) Среднее арифметическое с " + (s1 + 1) + "-го по " + (s2 + 1) + "-й элемент: " + subAvg);
    }
}
