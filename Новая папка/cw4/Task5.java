package Tasks_4;

public class Task5 {
    public static void main(String[] args) {
        // Инициализация массива 3x3
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Меняем местами первую и вторую строки
        swapRows(array, 0, 1);
        printArray(array);  // Выводим массив после изменения строк

        // Меняем местами первый и третий столбцы
        swapColumns(array, 0, 2);
        printArray(array);  // Выводим массив после изменения столбцов
    }

    // Метод для обмена местами двух строк
    public static void swapRows(int[][] array, int row1, int row2) {
        int[] temp = array[row1];  // Сохраняем строку row1 в временную переменную
        array[row1] = array[row2];  // Присваиваем строку row2 на место row1
        array[row2] = temp;  // Присваиваем сохраненную строку row1 на место row2
    }

    // Метод для обмена местами двух столбцов
    public static void swapColumns(int[][] array, int col1, int col2) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][col1];  // Сохраняем элемент в col1 для строки i
            array[i][col1] = array[i][col2];  // Присваиваем элемент из col2 в col1
            array[i][col2] = temp;  // Присваиваем сохраненный элемент в col2
        }
    }

    // Метод для вывода массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {  // Перебираем строки
            for (int j = 0; j < array[i].length; j++) {  // Перебираем элементы строки
                System.out.print(array[i][j] + " ");  // Выводим элемент
            }
            System.out.println();  // Переходим на новую строку после вывода всех элементов строки
        }
    }
}
