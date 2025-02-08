import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // Создание сканера для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрос размера матрицы (n x 9)
        System.out.print("Введите размер матрицы (n x 9): ");
        int n = scanner.nextInt();

        // Инициализация матрицы размером n x 9
        double[][] matrix = new double[n][9];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < 9; j++) {  // Проходим по столбцам
                matrix[i][j] = scanner.nextDouble();  // Вводим элемент матрицы
            }
        }

        // Массивы для хранения средних значений столбцов
        double[] columnAverages = new double[9];  // Средние значения всех столбцов
        double[] evenColumnAverages = new double[9];  // Средние значения столбцов с четными номерами
        int evenColumnCount = 0;  // Счётчик для чётных столбцов

        // Вычисление средних значений для каждого столбца
        for (int j = 0; j < 9; j++) {  // Проходим по столбцам
            double sum = 0;  // Переменная для хранения суммы элементов столбца

            // Вычисляем сумму всех элементов столбца
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];  // Добавляем значение текущего элемента столбца к сумме
            }

            // Сохраняем среднее значение для столбца
            columnAverages[j] = sum / n;

            // Если столбец чётный (по индексу), сохраняем его среднее в отдельный массив
            if (j % 2 == 0) {
                evenColumnAverages[j] = columnAverages[j];
                evenColumnCount++;  // Увеличиваем счётчик чётных столбцов
            }
        }

        // Вывод средних значений для всех столбцов
        System.out.println("Среднее арифметическое каждого столбца:");
        for (int j = 0; j < 9; j++) {
            System.out.printf("Столбец %d: %.2f%n", j + 1, columnAverages[j]);
        }

        // Вывод средних значений только для столбцов с чётными номерами
        System.out.println("Среднее арифметическое столбцов с четными номерами:");
        for (int j = 0; j < 9; j++) {
            if (j % 2 == 0) {  // Проверка, является ли столбец чётным
                System.out.printf("Столбец %d: %.2f%n", j + 1, evenColumnAverages[j]);
            }
        }
    }
}
