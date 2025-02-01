package Tasks_3.1;

public class Task12 {
    public static void main(String[] args) {
        double[][] matrix = {
            {1.2, -3.4, 0.5},
            {-2.1, 4.5, 1.1},
            {0.0, -0.5, 2.3}
        };
        
        double maxElement = findMaxElement(matrix);
        double[][] resultMatrix = divideByMaxElement(matrix, maxElement);
        
        System.out.println("Результат:");
        printMatrix(resultMatrix);
    }
    
    // Находит наибольший по модулю элемент в матрице
    public static double findMaxElement(double[][] matrix) {
        double max = matrix[0][0];
        for (double[] row : matrix) {
            for (double element : row) {
                if (Math.abs(element) > Math.abs(max)) {
                    max = element;
                }
            }
        }
        return max;
    }
    
    // Делит все элементы матрицы на наибольший по модулю элемент
    public static double[][] divideByMaxElement(double[][] matrix, double maxElement) {
        int n = matrix.length;
        int m = matrix[0].length;
        double[][] result = new double[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] / maxElement;
            }
        }
        
        return result;
    }
    
    // Выводит матрицу
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(String.format("%.2f ", element));
            }
            System.out.println();
        }
    }
}