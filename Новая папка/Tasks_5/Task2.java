package Tasks_5;

public class Task2 {
    public static void main(String[] args) {
        double[][] matrix = {
            {1, -2, 3},
            {-4, 5, -6},
            {7, 8, -9}
        };
        
        double sumAboveDiagonal = 0;
        double sumBelowDiagonal = 0;
        double sumOnDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] < 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i < j) sumAboveDiagonal += matrix[i][j];
                    else if (i > j) sumBelowDiagonal += matrix[i][j];
                    else sumOnDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("Сумма элементов выше главной диагонали: " + sumAboveDiagonal);
        System.out.println("Сумма элементов ниже главной диагонали: " + sumBelowDiagonal);
        System.out.println("Сумма элементов на главной диагонали: " + sumOnDiagonal);
    }
}
