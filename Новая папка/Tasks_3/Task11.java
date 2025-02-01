import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы (n x 9): ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][9];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double[] columnAverages = new double[9];
        double[] evenColumnAverages = new double[9];
        int evenColumnCount = 0;

        for (int j = 0; j < 9; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            columnAverages[j] = sum / n;

            if (j % 2 == 0) {
                evenColumnAverages[j] = columnAverages[j];
                evenColumnCount++;
            }
        }

        System.out.println("Среднее арифметическое каждого столбца:");
        for (int j = 0; j < 9; j++) {
            System.out.printf("Столбец %d: %.2f%n", j + 1, columnAverages[j]);
        }

        System.out.println("Среднее арифметическое столбцов с четными номерами:");
        for (int j = 0; j < 9; j++) {
            if (j % 2 == 0) {
                System.out.printf("Столбец %d: %.2f%n", j + 1, evenColumnAverages[j]);
            }
        }
    }
}
