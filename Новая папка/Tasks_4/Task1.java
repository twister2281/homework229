// Это 5 задания!!!!!!!!!!!!!!!!!!!!!!!!!



package Tasks_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (строк и столбцов): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        if (cols > 1) {
            int product = 1;
            for (int i = 0; i < rows; i++) {
                product *= array[i][1];
            }
            System.out.println("Произведение элементов второго столбца: " + product);
            System.out.println("Произведение трехзначное: " + (product >= 100 && product <= 999));
        } else {
            System.out.println("Массив не имеет второго столбца.");
        }

        System.out.print("Введите номер строки (начиная с 1): ");
        int rowNumber = scanner.nextInt() - 1;
        System.out.print("Введите заданное число: ");
        int threshold = scanner.nextInt();

        if (rowNumber >= 0 && rowNumber < rows) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += array[rowNumber][j];
            }
            System.out.println("Сумма строки: " + sum);
            System.out.println("Сумма больше заданного числа: " + (sum > threshold));
        } else {
            System.out.println("Некорректный номер строки.");
        }
    }
}
