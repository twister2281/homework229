package Tasks_4;

import java.util.Scanner;

public class Task2 {
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

        // Если в массиве больше трех строк, вычисляем сумму элементов четвертой строки
        if (rows > 3) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += array[3][j];  // Суммируем элементы четвертой строки (индекс 3)
            }
            // Выводим сумму четвертой строки и проверяем, является ли она двузначной
            System.out.println("Сумма элементов четвертой строки: " + sum);
            System.out.println("Сумма двузначная: " + (sum >= 10 && sum <= 99));
        } else {
            // Если в массиве нет четвертой строки, выводим соответствующее сообщение
            System.out.println("Массив не имеет четвертой строки.");
        }

        // Вводим номер столбца и заданное число для последующих вычислений
        System.out.print("Введите номер столбца (начиная с 1): ");
        int colNumber = scanner.nextInt() - 1;  // Преобразуем в индекс массива
        System.out.print("Введите заданное число: ");
        int threshold = scanner.nextInt();

        // Проверяем, что номер столбца корректен
        if (colNumber >= 0 && colNumber < cols) {
            int product = 1;
            // Вычисляем произведение всех элементов выбранного столбца
            for (int i = 0; i < rows; i++) {
                product *= array[i][colNumber];
            }
            // Выводим произведение столбца и проверяем, не превышает ли оно заданное число
            System.out.println("Произведение столбца: " + product);
            System.out.println("Произведение не превышает заданное число: " + (product <= threshold));
        } else {
            // Если номер столбца некорректный, выводим ошибку
            System.out.println("Некорректный номер столбца.");
        }
    }
}
