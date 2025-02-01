import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int n = 15;
        int[][] matrix = new int[n][n];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите элементы матрицы 15x15:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j < n && !found; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("а) Индексы первого ненулевого элемента: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        System.out.println("б) Индексы всех ненулевых элементов:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
