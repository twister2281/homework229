package Tasks_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размеры массива (строк и столбцов): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        if (rows > 3) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += array[3][j];
            }
            System.out.println("Сумма элементов четвертой строки: " + sum);
            System.out.println("Сумма двузначная: " + (sum >= 10 && sum <= 99));
        } else {
            System.out.println("Массив не имеет четвертой строки.");
        }

        System.out.print("Введите номер столбца (начиная с 1): ");
        int colNumber = scanner.nextInt() - 1;
        System.out.print("Введите заданное число: ");
        int threshold = scanner.nextInt();

        if (colNumber >= 0 && colNumber < cols) {
            int product = 1;
            for (int i = 0; i < rows; i++) {
                product *= array[i][colNumber];
            }
            System.out.println("Произведение столбца: " + product);
            System.out.println("Произведение не превышает заданное число: " + (product <= threshold));
        } else {
            System.out.println("Некорректный номер столбца.");
        }
    }
}
