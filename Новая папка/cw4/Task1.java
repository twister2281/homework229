package Tasks_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим размеры массива (количество строк и столбцов)
        System.out.print("Введите размер массива (строк и столбцов): ");
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

        // Если в массиве больше одного столбца, вычисляем произведение элементов второго столбца
        if (cols > 1) {
            int product = 1;
            for (int i = 0; i < rows; i++) {
                product *= array[i][1];  // Умножаем элементы второго столбца
            }
            // Выводим результат произведения и проверяем, является ли оно трехзначным
            System.out.println("Произведение элементов второго столбца: " + product);
            System.out.println("Произведение трехзначное: " + (product >= 100 && product <= 999));
        } else {
            // Если массив не имеет второго столбца, выводим соответствующее сообщение
            System.out.println("Массив не имеет второго столбца.");
        }

        // Вводим номер строки и заданное число для последующих вычислений
        System.out.print("Введите номер строки (начиная с 1): ");
        int rowNumber = scanner.nextInt() - 1;  // Преобразуем в индекс массива
        System.out.print("Введите заданное число: ");
        int threshold = scanner.nextInt();

        // Проверяем, что номер строки корректен
        if (rowNumber >= 0 && rowNumber < rows) {
            int sum = 0;
            // Вычисляем сумму элементов выбранной строки
            for (int j = 0; j < cols; j++) {
                sum += array[rowNumber][j];
            }
            // Выводим сумму строки и проверяем, больше ли она заданного числа
            System.out.println("Сумма строки: " + sum);
            System.out.println("Сумма больше заданного числа: " + (sum > threshold));
        } else {
            // Если номер строки некорректный, выводим ошибку
            System.out.println("Некорректный номер строки.");
        }
    }
}
