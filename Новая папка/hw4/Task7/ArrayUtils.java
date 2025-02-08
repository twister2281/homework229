package Task7;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {

    // Метод для вычисления суммы элементов массива
    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Метод для вычисления среднего арифметического элементов массива
    public static double average(int[] array) {
        if (array.length == 0) return 0;
        return (double) getSum(array) / array.length;
    }

    // Метод для нахождения максимального значения в массиве
    public static int max_value(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для нахождения минимального значения в массиве
    public static int min_value(int[] array) {
        if (array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Метод для нахождения моды (наиболее часто встречающееся значение) массива
    public static int mode(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mode;
    }

    // Метод для сортировки массива по возрастанию
    public static int[] sort_ascending(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
