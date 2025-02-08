public class Task3 {
    public static void main(String[] args) {
        // Инициализация массива с элементами
        int[] array = {5, 3, 7, 8, 2, 6, 1, 9, 4, 0, 11, 10, 15, 12, 13};
        
        // Индексы для минимального и максимального элементов
        int minIndex = 0, maxIndex = 0;
        
        // Поиск индексов минимального и максимального элементов в массиве
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;  // Обновляем индекс минимального элемента
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;  // Обновляем индекс максимального элемента
            }
        }

        // Если минимальный индекс больше максимального, меняем их местами
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // Переставляем элементы массива между minIndex и maxIndex
        // Используем два указателя: один с минимального индекса, второй с максимального
        for (int i = minIndex, j = maxIndex; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;  // Меняем местами элементы на позициях i и j
        }

        // Выводим измененный массив
        for (int i : array) {
            System.out.print(i + " ");  // Печатаем каждый элемент массива
        }
    }
}
