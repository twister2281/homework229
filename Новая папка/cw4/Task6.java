package Tasks_4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        // Инициализация двумерного массива
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Получаем первые четные элементы столбцов
        int[] evenInColumns = firstEvenInColumns(array);
        // Выводим результат для первых четных элементов в столбцах
        System.out.println("Первые четные элементы столбцов: " + Arrays.toString(evenInColumns));

        // Получаем последние нечетные элементы строк
        int[] oddInRows = lastOddInRows(array);
        // Выводим результат для последних нечетных элементов в строках
        System.out.println("Последние нечетные элементы строк: " + Arrays.toString(oddInRows));
    }

    // Метод для нахождения первого четного элемента в каждом столбце
    public static int[] firstEvenInColumns(int[][] array) {
        // Массив для хранения первых четных элементов столбцов
        int[] result = new int[array[0].length];
        
        // Перебираем каждый столбец
        for (int j = 0; j < array[0].length; j++) {
            // Изначально результат для столбца — 0 (если не будет найдено четного числа)
            result[j] = 0; 
            
            // Перебираем строки в текущем столбце
            for (int i = 0; i < array.length; i++) {
                // Если элемент четный
                if (array[i][j] % 2 == 0) {
                    // Записываем его в результат и прекращаем поиск в этом столбце
                    result[j] = array[i][j];
                    break;
                }
            }
        }
        return result;  // Возвращаем массив с первыми четными элементами в столбцах
    }

    // Метод для нахождения последнего нечетного элемента в каждой строке
    public static int[] lastOddInRows(int[][] array) {
        // Массив для хранения последних нечетных элементов строк
        int[] result = new int[array.length];
        
        // Перебираем каждую строку
        for (int i = 0; i < array.length; i++) {
            // Изначально результат для строки — 0 (если не будет найдено нечетного числа)
            result[i] = 0; 
            
            // Перебираем элементы строки с конца
            for (int j = array[i].length - 1; j >= 0; j--) {
                // Если элемент нечетный
                if (array[i][j] % 2 != 0) {
                    // Записываем его в результат и прекращаем поиск в этой строке
                    result[i] = array[i][j];
                    break;
                }
            }
        }
        return result;  // Возвращаем массив с последними нечетными элементами в строках
    }
}
