public class Task9 {
    public static void main(String[] args) {
        // Инициализация массива
        int[] array = {3, 2, 7, 6, 1};

        // Проход по массиву для сортировки пары соседних элементов
        for (int i = 0; i < array.length - 1; i++) {
            // Если текущий элемент больше следующего, меняем их местами
            if (array[i] > array[i + 1]) {
                int temp = array[i]; // Временная переменная для хранения текущего элемента
                array[i] = array[i + 1]; // Меняем местами элементы
                array[i + 1] = temp; // Завершаем замену
            }
        }

        // Вывод последнего элемента массива
        System.out.println("Последний элемент массива: " + array[array.length - 1]);
    }
}
