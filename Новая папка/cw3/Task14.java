import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // Размер матрицы 15x15
        int n = 15;
        int[][] matrix = new int[n][n];
        Scanner scanner = new Scanner(System.in);

        // Ввод элементов матрицы размером 15x15
        System.out.println("Введите элементы матрицы 15x15:");
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < n; j++) {  // Проходим по столбцам
                matrix[i][j] = scanner.nextInt();  // Вводим элемент матрицы
            }
        }

        // Флаг для поиска первого ненулевого элемента
        boolean found = false;

        // Поиск и вывод индексов первого ненулевого элемента
        for (int i = 0; i < n && !found; i++) {  // Проходим по строкам
            for (int j = 0; j < n && !found; j++) {  // Проходим по столбцам
                if (matrix[i][j] != 0) {  // Если элемент ненулевой
                    System.out.println("а) Индексы первого ненулевого элемента: (" + i + ", " + j + ")");
                    found = true;  // Останавливаем дальнейший поиск
                }
            }
        }

        // Вывод индексов всех ненулевых элементов
        System.out.println("б) Индексы всех ненулевых элементов:");
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < n; j++) {  // Проходим по столбцам
                if (matrix[i][j] != 0) {  // Если элемент ненулевой
                    System.out.println("(" + i + ", " + j + ")");  // Выводим индексы
                }
            }
        }
    }
}
