import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        // Инициализация массива
        int[] array = {3, 5, 7, 9, 2, 4, 6, 8, 1, 10};

        // Инициализация переменных для максимума и минимума
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int minIndex = -1; // Индекс минимального элемента

        // Перебор всех элементов массива для нахождения максимума, второго максимума,
        // минимума и второго минимума
        for (int num : array) {
            // Обновляем максимум и второй максимум
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            // Обновляем минимум и второй минимум
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        // Находим индекс минимального элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) minIndex = i + 1; // Индекс с учетом 1-индексации
        }

        // Выводим результаты
        System.out.println("a) Максимальный элемент: " + max + ", второй максимум: " + secondMax);
        System.out.println("b) Минимальный элемент: " + min + ", второй минимум: " + secondMin);
        System.out.println("c) Индекс минимального элемента: " + minIndex);
    }
}
