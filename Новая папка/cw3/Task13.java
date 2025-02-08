import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // Создание сканера для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрос размеров матрицы (n x m)
        System.out.print("Введите размеры матрицы (n x m): ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Инициализация матрицы размером n x m
        double[][] matrix = new double[n][m];
        System.out.println("Введите элементы матрицы:");

        // Ввод элементов матрицы
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < m; j++) {  // Проходим по столбцам
                matrix[i][j] = scanner.nextDouble();  // Вводим элемент матрицы
            }
        }

        // Переменные для хранения минимального и максимального элементов
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        // Поиск минимального и максимального элементов в матрице
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < m; j++) {  // Проходим по столбцам
                // Обновляем минимальный элемент, если нашли меньший
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                // Обновляем максимальный элемент, если нашли больший
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Вычисляем среднее арифметическое минимального и максимального элементов
        double average = (min + max) / 2;

        // Вывод результатов
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Среднее арифметическое минимального и максимального: " + average);
    }
}
