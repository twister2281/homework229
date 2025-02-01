package Tasks_3.1;

public class Task14 {
    public static void main(String[] args) {
        int[][] matrix = new int[15][15];
        
        // Заполнение матрицы для примера
        matrix[2][3] = 5;
        matrix[6][7] = -10;
        matrix[8][12] = 3;
        
        // a) Поиск одного ненулевого элемента
        findNonZeroElement(matrix);
        
        // b) Поиск всех ненулевых элементов
        findAllNonZeroElements(matrix);
    }
    
    // Поиск одного ненулевого элемента
    public static void findNonZeroElement(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Ненулевой элемент найден на позиции: [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Ненулевых элементов нет.");
    }
    
    // Поиск всех ненулевых элементов
    public static void findAllNonZeroElements(int[][] matrix) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Ненулевой элемент на позиции: [" + i + "][" + j + "] с значением " + matrix[i][j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Ненулевых элементов нет.");
        }
    }
}