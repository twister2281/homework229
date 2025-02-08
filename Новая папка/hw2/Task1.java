import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Инициализация массива чисел от 1 до 15
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        
        // a) Переставить элементы между 3 и 9
        // Для этого вызываем метод reverse с индексами 2 и 8 (массив индексируется с 0)
        reverse(arr, 2, 8);
        System.out.println("a) " + Arrays.toString(arr));
        
        // b) Переставить элементы между k и s
        // Пользователь вводит значения k и s (где k < s), и выполняем перестановку в указанном диапазоне
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите k и s (k < s): ");
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        reverse(arr, k, s); // Переставляем элементы между индексами k и s
        System.out.println("b) " + Arrays.toString(arr));
        
        // c) Переставить элементы между максимальным и минимальным значениями в массиве
        // Ищем индексы максимального и минимального значений в массиве
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i; // Находим индекс максимального элемента
            if (arr[i] < arr[minIndex]) minIndex = i; // Находим индекс минимального элемента
        }
        // Вызываем метод reverse для перестановки элементов между индексами максимума и минимума
        reverse(arr, Math.min(maxIndex, minIndex), Math.max(maxIndex, minIndex));
        System.out.println("c) " + Arrays.toString(arr));
    }

    // Метод для перестановки элементов массива между индексами start и end
    private static void reverse(int[] arr, int start, int end) {
        // Пока start меньше end, меняем элементы местами
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; // Увеличиваем start
            end--;   // Уменьшаем end
        }
    }
}
