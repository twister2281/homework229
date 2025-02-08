import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // Инициализация массива чисел
        int[] array = {3, -7, 5, 8, -2, 10, -6, 4, -9, 1, 12, -3, 6, -1, 7};
        
        // Переменные для хранения индексов первого отрицательного и последнего положительного элементов
        int firstNegativeIndex = -1;
        int lastPositiveIndex = -1;
        
        // Проходим по массиву, чтобы найти первый отрицательный элемент и последний положительный
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && firstNegativeIndex == -1) {
                firstNegativeIndex = i; // Запоминаем индекс первого отрицательного элемента
            }
            if (array[i] > 0) {
                lastPositiveIndex = i; // Запоминаем индекс последнего положительного элемента
            }
        }
        
        // Если оба индекса найдены, меняем местами элементы
        if (firstNegativeIndex != -1 && lastPositiveIndex != -1) {
            int temp = array[firstNegativeIndex];
            array[firstNegativeIndex] = array[lastPositiveIndex];
            array[lastPositiveIndex] = temp; // Обмен значениями между этими элементами
        }
        
        // Выводим измененный массив
        System.out.println("Массив после замены: " + Arrays.toString(array));
    }
}
