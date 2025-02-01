import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размеры матрицы (n x m): ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        double[][] matrix = new double[n][m];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double maxElement = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Math.abs(matrix[i][j]) > maxElement) {
                    maxElement = Math.abs(matrix[i][j]);
                }
            }
        }

        System.out.println("Наибольший по модулю элемент: " + maxElement);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] /= maxElement;
            }
        }

        System.out.println("Нормализованная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
