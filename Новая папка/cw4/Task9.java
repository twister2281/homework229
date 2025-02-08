package Tasks_4;

import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        // Создаем двумерный массив
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Создаем три списка для хранения чисел
        ArrayList<Integer> multiplesOfThree = new ArrayList<>();  // Числа, кратные 3
        ArrayList<Integer> positiveNumbers = new ArrayList<>();   // Положительные числа
        ArrayList<Integer> nonPositiveNumbers = new ArrayList<>(); // Неположительные числа

        // Проходим по всем элементам массива
        for (int i = 0; i < array.length; i++) {         // По строкам массива
            for (int j = 0; j < array[i].length; j++) {  // По столбцам массива
                // Если число кратно 3, добавляем его в список multiplesOfThree
                if (array[i][j] % 3 == 0) 
                    multiplesOfThree.add(array[i][j]);
                
                // Если число положительное, добавляем его в список positiveNumbers
                if (array[i][j] > 0) 
                    positiveNumbers.add(array[i][j]);
                
                // Если число неположительное (0 или отрицательное), добавляем в nonPositiveNumbers
                else 
                    nonPositiveNumbers.add(array[i][j]);
            }
        }

        // Выводим результаты
        System.out.println("Элементы, кратные трем: " + multiplesOfThree);  // Вывод чисел, кратных 3
        System.out.println("Положительные элементы: " + positiveNumbers);    // Вывод положительных чисел
        System.out.println("Неположительные элементы: " + nonPositiveNumbers); // Вывод неположительных чисел
    }
}
