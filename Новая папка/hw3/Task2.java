// Задача 2. Работа с действительной квадратной матрицей порядка n
public class Task2 {
    public static void main(String[] args) {
        int n = 4; // Размер матрицы
        double[][] matrix = {
            {-1.2, 3.4, 5.6, 7.8},
            {2.3, -4.5, 6.7, 8.9},
            {-1.1, 2.2, -3.3, 4.4},
            {5.5, 6.6, -7.7, 8.8}
        };

        // Переменные для хранения сумм
        double sumBelowDiagonal = 0;
        double sumAboveDiagonal = 0;
        double sumOnDiagonal = 0;

        // Обрабатываем строки, начинающиеся с отрицательного элемента
        for (int i = 0; i < n; i++) {
            // Проверяем, начинается ли строка с отрицательного элемента
            if (matrix[i][0] < 0) {
                for (int j = 0; j < n; j++) {
                    // Суммируем элементы ниже главной диагонали
                    if (i > j) {
                        sumBelowDiagonal += matrix[i][j];
                    }
                    // Суммируем элементы выше главной диагонали
                    if (i < j) {
                        sumAboveDiagonal += matrix[i][j];
                    }
                    // Суммируем элементы на главной диагонали
                    if (i == j) {
                        sumOnDiagonal += matrix[i][j];
                    }
                }
            }
        }

        // Выводим результаты
        System.out.println("Сумма элементов ниже главной диагонали: " + sumBelowDiagonal);
        System.out.println("Сумма элементов выше главной диагонали: " + sumAboveDiagonal);
        System.out.println("Сумма элементов на главной диагонали: " + sumOnDiagonal);
    }
}
