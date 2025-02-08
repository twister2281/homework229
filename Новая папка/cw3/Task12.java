import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // Создание сканера для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрос размеров матрицы (n x m)
        System.out.print("Введите размеры матрицы (n x m): ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Инициализация матрицы размером n x m
        double[][] matrix = new double[n][m];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < m; j++) {  // Проходим по столбцам
                matrix[i][j] = scanner.nextDouble();  // Вводим элемент матрицы
            }
        }

        // Переменная для хранения наибольшего по модулю элемента
        double maxElement = Double.NEGATIVE_INFINITY;

        // Поиск наибольшего по модулю элемента в матрице
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < m; j++) {  // Проходим по столбцам
                // Если текущий элемент по модулю больше максимального, обновляем maxElement
                if (Math.abs(matrix[i][j]) > maxElement) {
                    maxElement = Math.abs(matrix[i][j]);
                }
            }
        }

        // Вывод наибольшего по модулю элемента
        System.out.println("Наибольший по модулю элемент: " + maxElement);

        // Нормализация матрицы (делим каждый элемент на maxElement)
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < m; j++) {  // Проходим по столбцам
                matrix[i][j] /= maxElement;  // Нормализуем элемент
            }
        }

        // Вывод нормализованной матрицы
        System.out.println("Нормализованная матрица:");
        for (int i = 0; i < n; i++) {  // Проходим по строкам
            for (int j = 0; j < m; j++) {  // Проходим по столбцам
                System.out.printf("%.2f ", matrix[i][j]);  // Выводим элемент с 2 знаками после запятой
            }
            System.out.println();  // Переход на новую строку после вывода всей строки
        }
    }
}
