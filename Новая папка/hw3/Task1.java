// Задача 1. Работа с целочисленной квадратной матрицей порядка n
public class Task1 {
    public static void main(String[] args) {
        int n = 4; // Размер матрицы
        int[][] matrix = {
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 0, 0, 0},
            {3, 3, 3, 3}
        };

        // Задача 1A: Найти строки, все элементы которых - нули
        System.out.println("Строки, элементы которых - нули:");
        for (int i = 0; i < n; i++) {
            boolean isZeroRow = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    isZeroRow = false; // Если хотя бы один элемент не ноль, строка не подходит
                    break;
                }
            }
            if (isZeroRow) {
                System.out.println("Строка " + (i + 1));
            }
        }

        // Задача 1B: Найти строки, элементы которых одинаковы
        System.out.println("\nСтроки, элементы которых одинаковы:");
        for (int i = 0; i < n; i++) {
            boolean isIdenticalRow = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) { // Если элементы строки не одинаковы
                    isIdenticalRow = false;
                    break;
                }
            }
            if (isIdenticalRow) {
                System.out.println("Строка " + (i + 1));
            }
        }

        // Задача 1C: Найти строки, все элементы которых нечетные
        System.out.println("\nСтроки, элементы которых нечетные:");
        for (int i = 0; i < n; i++) {
            boolean isOddRow = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) { // Если хотя бы один элемент четный
                    isOddRow = false;
                    break;
                }
            }
            if (isOddRow) {
                System.out.println("Строка " + (i + 1));
            }
        }

        // Задача 1D: Найти строки, элементы которых образуют монотонную последовательность
        System.out.println("\nСтроки, элементы которых образуют монотонную последовательность:");
        for (int i = 0; i < n; i++) {
            boolean isMonotonic = true;
            boolean isIncreasing = true;
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    isIncreasing = false; // Если последовательность убывающая
                    break;
                }
            }
            if (!isIncreasing) {
                isMonotonic = false;
                for (int j = 0; j < n - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isMonotonic = false; // Если последовательность не монотонно убывающая
                        break;
                    }
                }
            }
            if (isMonotonic) {
                System.out.println("Строка " + (i + 1));
            }
        }

        // Задача 1E: Найти строки, элементы которых образуют симметричную последовательность (палиндром)
        System.out.println("\nСтроки, элементы которых образуют палиндром:");
        for (int i = 0; i < n; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < n / 2; j++) {
                if (matrix[i][j] != matrix[i][n - 1 - j]) { // Если элементы не симметричны
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Строка " + (i + 1));
            }
        }
    }
}
