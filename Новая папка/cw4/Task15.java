package Tasks_4;

public class Task15 {
    public static void main(String[] args) {
        // Инициализация массива и целевого элемента для поиска
        int[] array = {10, 20, 30, 40, 50}; // Массив чисел
        int target = 30; // Целевой элемент для поиска

        // Вызов метода для бинарного поиска целевого элемента
        int index = binarySearch(array, target);

        // Если индекс равен -1, значит элемент не найден
        if (index == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден на позиции: " + index); // Выводим индекс найденного элемента
        }
    }

    // Метод для бинарного поиска элемента в отсортированном массиве
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1; // Устанавливаем границы поиска

        // Пока левая граница меньше или равна правой
        while (left <= right) {
            // Вычисляем индекс середины массива
            int mid = left + (right - left) / 2;

            // Если середина массива равна целевому элементу, возвращаем индекс
            if (array[mid] == target) {
                return mid;
            }

            // Если элемент в середине меньше целевого, ищем справа
            else if (array[mid] < target) {
                left = mid + 1;
            }

            // Если элемент в середине больше целевого, ищем слева
            else {
                right = mid - 1;
            }
        }
        // Если элемент не найден, возвращаем -1
        return -1;
    }
}
