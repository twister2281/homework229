package Tasks_4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        // Инициализация двух двумерных массивов
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Суммирование элементов двух массивов
        int[][] sumArray = sumArrays(array1, array2);
        System.out.println("Сумма массивов:");
        printArray(sumArray);  // Печать результата суммы

        // Проверка знаков элементов соответствующих позиций двух массивов
        int[][] signCheckArray = checkSigns(array1, array2);
        System.out.println("Проверка знаков:");
        printArray(signCheckArray);  // Печать результата проверки знаков
    }

    // Метод для суммирования элементов двух массивов
    public static int[][] sumArrays(int[][] array1, int[][] array2) {
        // Создаем новый массив для хранения суммы
        int[][] result = new int[array1.length][array1[0].length];
        
        // Перебираем элементы обоих массивов и суммируем их
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;  // Возвращаем результат
    }

    // Метод для проверки знаков элементов двух массивов
    public static int[][] checkSigns(int[][] array1, int[][] array2) {
        // Создаем новый массив для хранения результатов проверки знаков
        int[][] result = new int[array1.length][array1[0].length];
        
        // Перебираем элементы обоих массивов и проверяем их знаки
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                // Если знаки элементов совпадают, записываем 100
                if ((array1[i][j] >= 0 && array2[i][j] >= 0) || (array1[i][j] < 0 && array2[i][j] < 0)) {
                    result[i][j] = 100;
                } else {
                    result[i][j] = 0;  // Если знаки разные, записываем 0
                }
            }
        }
        return result;  // Возвращаем результат
    }

    // Метод для печати массива
    public static void printArray(int[][] array) {
        // Перебираем и выводим все элементы массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");  // Печатаем элемент массива
            }
            System.out.println();  // Переход на новую строку
        }
    }
}
