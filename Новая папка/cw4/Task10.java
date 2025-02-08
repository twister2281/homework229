package Tasks_4;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int rows = 3; // Указываем количество строк
        int[][] array = new int[rows][]; // Создаем массив с переменным количеством столбцов
        Random random = new Random(); // Создаем объект для генерации случайных чисел

        // Заполнение массива случайными числами
        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1]; // Для каждой строки выделяем массив, количество элементов зависит от строки
            for (int j = 0; j <= i; j++) {
                array[i][j] = random.nextInt(101); // Заполняем элементы случайными числами от 0 до 100
            }
        }

        // Вывод массива на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " "); // Печатаем элементы текущей строки
            }
            System.out.println(); // Переход на новую строку после вывода элементов
        }
    }
}
        