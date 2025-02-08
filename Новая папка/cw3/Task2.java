public class Task2 {
    public static void main(String[] args) {
        // Инициализация массива с положительными и отрицательными числами
        int[] array = {-5, 3, -2, 8, -1, 4, -3, 6};
        
        // Инициализация переменных для индексов первого отрицательного числа
        // и последнего положительного числа
        int firstNegative = -1, lastPositive = -1;

        // Поиск первого отрицательного числа и последнего положительного числа
        for (int i = 0; i < array.length; i++) {
            // Если найдено первое отрицательное число, сохраняем его индекс
            if (array[i] < 0 && firstNegative == -1) {
                firstNegative = i;
            }
            // Если найдено положительное число, сохраняем его индекс
            if (array[i] > 0) {
                lastPositive = i;
            }
        }

        // Если оба индекса найдены, меняем местами элементы
        if (firstNegative != -1 && lastPositive != -1) {
            int temp = array[firstNegative];
            array[firstNegative] = array[lastPositive];
            array[lastPositive] = temp;
        }

        // Выводим измененный массив
        for (int i : array) {
            System.out.print(i + " ");  // Печатаем каждый элемент массива через пробел
        }
    }
}
