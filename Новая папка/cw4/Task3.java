package Tasks_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим размеры массива (количество строк и столбцов)
        System.out.print("Введите размеры массива (строк и столбцов): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Создаем двумерный массив заданного размера
        int[][] array = new int[rows][cols];
        System.out.println("Введите элементы массива:");
        // Вводим элементы массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Вводим номера строки и столбца, которые необходимо анализировать
        System.out.print("Введите номер строки (k): ");
        int k = scanner.nextInt() - 1;  // Преобразуем в индекс массива
        System.out.print("Введите номер столбца (s): ");
        int s = scanner.nextInt() - 1;  // Преобразуем в индекс массива

        // Проверяем корректность введенных номеров строки и столбца
        if (k >= 0 && k < rows && s >= 0 && s < cols) {
            int rowSum = 0, colSum = 0;

            // Вычисляем сумму элементов k-й строки
            for (int j = 0; j < cols; j++) {
                rowSum += array[k][j];
            }

            // Вычисляем сумму элементов s-го столбца
            for (int i = 0; i < rows; i++) {
                colSum += array[i][s];
            }

            // Выводим результаты: сумму строки, сумму столбца и максимальную из них
            System.out.println("Сумма k-й строки: " + rowSum);
            System.out.println("Сумма s-го столбца: " + colSum);
            System.out.println("Максимальная сумма: " + Math.max(rowSum, colSum));
        } else {
            // Если номера строки или столбца некорректны, выводим ошибку
            System.out.println("Некорректные номера строки или столбца.");
        }
    }
}
