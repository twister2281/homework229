import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        // Инициализация массива чисел
        int[] arr = {3, 5, 7, 3, 8, 5, 9, 1, 2, 2, 4, 6, 7, 9, 10};

        // а) Числа, встречающиеся один раз
        // Используем HashMap для подсчета частоты каждого числа
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            // Увеличиваем счетчик для каждого числа
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Числа, встречающиеся один раз:");
        // Проходим по всем записям в Map и выводим числа, которые встречаются только один раз
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();

        // б) Числа, взятые по одному из группы равных
        System.out.println("Числа без повторов:");
        // Используем LinkedHashSet, чтобы сохранить уникальные числа в порядке их появления
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }
        // Выводим уникальные числа
        System.out.println(uniqueNumbers);

        // в) Количество различных членов последовательности
        // Размер Set дает количество уникальных чисел
        System.out.println("Количество различных чисел: " + uniqueNumbers.size());

        // г) Сколько чисел встречается более одного раза
        int countRepeated = 0;
        // Проходим по значениям в freq (частотам чисел) и считаем, сколько чисел встречается больше одного раза
        for (int value : freq.values()) {
            if (value > 1) countRepeated++;
        }
        System.out.println("Количество повторяющихся чисел: " + countRepeated);

        // д) Есть ли хотя бы одна пара совпадающих чисел
        // Если countRepeated больше 0, значит, есть хотя бы одно повторяющееся число
        boolean hasDuplicate = countRepeated > 0;
        System.out.println("Есть ли повторяющиеся числа: " + hasDuplicate);
    }
}
