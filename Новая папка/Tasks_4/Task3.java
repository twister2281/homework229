package Tasks_4;

import java.util.Scanner;

public class Task3 {
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

        System.out.print("Введите номер строки (k): ");
        int k = scanner.nextInt() - 1;
        System.out.print("Введите номер столбца (s): ");
        int s = scanner.nextInt() - 1;

        if (k >= 0 && k < rows && s >= 0 && s < cols) {
            int rowSum = 0, colSum = 0;

            for (int j = 0; j < cols; j++) {
                rowSum += array[k][j];
            }

            for (int i = 0; i < rows; i++) {
                colSum += array[i][s];
            }

            System.out.println("Сумма k-й строки: " + rowSum);
            System.out.println("Сумма s-го столбца: " + colSum);
            System.out.println("Максимальная сумма: " + Math.max(rowSum, colSum));
        } else {
            System.out.println("Некорректные номера строки или столбца.");
        }
    }
}
