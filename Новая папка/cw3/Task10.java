import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        // Инициализация массива
        int[] array = {3, 5, 7, 9, 2, 4, 6, 8, 1, 10};

        // Обмен значениями элементов на позициях 1 и 4
        swap(array, 1, 4);

        // Обмен значениями элементов на позициях 2 и 7
        swap(array, 2, 7);

        // Нахождение индекса максимального элемента и обмен с элементом на позиции 2
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) maxIndex = i;
        }
        swap(array, 2, maxIndex);

        // Нахождение индекса минимального элемента и обмен с элементом на позиции 0
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[minIndex]) minIndex = i;
        }
        swap(array, 0, minIndex);

        // Вывод итогового массива
        System.out.println("Итоговый массив: " + Arrays.toString(array));
    }

    // Метод для обмена значениями элементов на указанных индексах
    private static void swap(int[] array, int i, int j) {
        int temp = array[i]; // Сохраняем значение элемента на позиции i во временную переменную
        array[i] = array[j]; // Меняем местами элементы на позициях i и j
        array[j] = temp; // Завершаем обмен
    }
}
