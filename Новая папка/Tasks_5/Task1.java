// Это 6 задания!!!!!!!


package Tasks_5;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = {
            {0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1},
            {1, 3, 5, 7, 9},
            {2, 4, 6, 8, 10},
            {5, 5, 5, 5, 5}
        };

        System.out.println("Строки, где все элементы - нули:");
        for (int i = 0; i < n; i++) {
            boolean allZeroes = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    allZeroes = false;
                    break;
                }
            }
            if (allZeroes) System.out.println(i);
        }

        System.out.println("Строки, где все элементы одинаковы:");
        for (int i = 0; i < n; i++) {
            boolean allEqual = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) System.out.println(i);
        }

        System.out.println("Строки, где все элементы нечетные:");
        for (int i = 0; i < n; i++) {
            boolean allOdd = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) System.out.println(i);
        }

        System.out.println("Строки, где элементы образуют монотонную последовательность:");
        for (int i = 0; i < n; i++) {
            boolean isMonotonic = true;
            boolean increasing = matrix[i][0] < matrix[i][1];
            for (int j = 1; j < n - 1; j++) {
                if ((increasing && matrix[i][j] >= matrix[i][j + 1]) || (!increasing && matrix[i][j] <= matrix[i][j + 1])) {
                    isMonotonic = false;
                    break;
                }
            }
            if (isMonotonic) System.out.println(i);
        }

        System.out.println("Строки, где элементы образуют палиндром:");
        for (int i = 0; i < n; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < n / 2; j++) {
                if (matrix[i][j] != matrix[i][n - 1 - j]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println(i);
        }
    }
}
