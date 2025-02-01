package Tasks_3.1;

import java.util.*;

public class Tasks7_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 7
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Пример массива

        // а)
        int sum = Arrays.stream(array).sum();
        System.out.println("Сумма всех элементов массива: " + sum);

        // б)
        int product = Arrays.stream(array).reduce(1, (a, b) -> a * b);
        System.out.println("Произведение всех элементов массива: " + product);

        // в)
        int sumOfSquares = Arrays.stream(array).map(x -> x * x).sum();
        System.out.println("Сумма квадратов всех элементов массива: " + sumOfSquares);

        // г)
        int sumOfFirstSix = Arrays.stream(array).limit(6).sum();
        System.out.println("Сумма первых шести элементов массива: " + sumOfFirstSix);

        // д)
        System.out.print("Введите k1 и k2 (k2 > k1): ");
        int k1 = scanner.nextInt(), k2 = scanner.nextInt();
        int sumFromK1ToK2 = Arrays.stream(array, k1 - 1, k2).sum();
        System.out.println("Сумма элементов с k1-го по k2-й: " + sumFromK1ToK2);

        // е)
        double average = Arrays.stream(array).average().orElse(0);
        System.out.println("Среднее арифметическое всех элементов массива: " + average);

        // ж)
        System.out.print("Введите s1 и s2 (s2 > s1): ");
        int s1 = scanner.nextInt(), s2 = scanner.nextInt();
        double averageFromS1ToS2 = Arrays.stream(array, s1 - 1, s2).average().orElse(0);
        System.out.println("Среднее арифметическое элементов с s1-го по s2-й: " + averageFromS1ToS2);

        // Задача 8
        int max = Arrays.stream(array).max().orElse(0);
        int secondMax = Arrays.stream(array).filter(x -> x != max).max().orElse(0);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Второй максимальный элемент: " + secondMax);

        int min = Arrays.stream(array).min().orElse(0);
        int secondMin = Arrays.stream(array).filter(x -> x != min).min().orElse(0);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Второй минимальный элемент: " + secondMin);

        int minIndex = IntStream.range(0, array.length).filter(i -> array[i] == min).findFirst().orElse(-1);
        System.out.println("Индекс минимального элемента: " + (minIndex + 1));

        // Задача 9
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println("Последний элемент после перестановок: " + array[array.length - 1]);

        // Задача 10
        int[] swapArray = {1, 2, 3, 4, 5, 6, 7};

        // а)
        int temp = swapArray[1];
        swapArray[1] = swapArray[4];
        swapArray[4] = temp;
        System.out.println("Массив после замены 2-го и 5-го элементов: " + Arrays.toString(swapArray));

        // б)
        System.out.print("Введите m и n: ");
        int m = scanner.nextInt(), n = scanner.nextInt();
        temp = swapArray[m - 1];
        swapArray[m - 1] = swapArray[n - 1];
        swapArray[n - 1] = temp;
        System.out.println("Массив после замены m-го и n-го элементов: " + Arrays.toString(swapArray));

        // в)
        int maxIdx = IntStream.range(0, swapArray.length).filter(i -> swapArray[i] == max).findFirst().orElse(-1);
        temp = swapArray[2];
        swapArray[2] = swapArray[maxIdx];
        swapArray[maxIdx] = temp;
        System.out.println("Массив после замены 3-го и максимального элементов: " + Arrays.toString(swapArray));

        // г)
        int lastMinIdx = IntStream.range(0, swapArray.length).filter(i -> swapArray[i] == min).reduce((a, b) -> b).orElse(-1);
        temp = swapArray[0];
        swapArray[0] = swapArray[lastMinIdx];
        swapArray[lastMinIdx] = temp;
        System.out.println("Массив после замены 1-го и минимального элементов: " + Arrays.toString(swapArray));

        // Задача 11
        System.out.print("Введите n для матрицы n x 9: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][9];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = random.nextDouble() * 100; // Заполнение случайными числами
            }
        }

        double[] columnAverages = new double[9];
        for (int j = 0; j < 9; j++) {
            double columnSum = 0;
            for (int i = 0; i < n; i++) {
                columnSum += matrix[i][j];
            }
            columnAverages[j] = columnSum / n;
        }
        System.out.println("Средние арифметические для всех столбцов: " + Arrays.toString(columnAverages));

        double evenColumnSum = 0;
        int evenColumnCount = 0;
        for (int j = 1; j < 9; j += 2) {
            for (int i = 0; i < n; i++) {
                evenColumnSum += matrix[i][j];
            }
            evenColumnCount++;
        }
        System.out.println("Среднее арифметическое для столбцов с четными номерами: " + (evenColumnSum / evenColumnCount));
    }
}
