package Tasks_3.1;

public class Task13 {
    public static void main(String[] args) {
        double[][] matrix = {
            {1.2, -3.4, 0.5},
            {-2.1, 4.5, 1.1},
            {0.0, -0.5, 2.3}
        };
        
        double[] minMax = findMinMax(matrix);
        double average = (minMax[0] + minMax[1]) / 2.0;
        
        System.out.println("Среднее арифметическое наибольшего и наименьшего элементов: " + average);
    }
    
    // Находит минимальное и максимальное значения в матрице
    public static double[] findMinMax(double[][] matrix) {
        double min = matrix[0][0];
        double max = matrix[0][0];
        
        for (double[] row : matrix) {
            for (double element : row) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
            }
        }
        
        return new double[] { min, max };
    }
}