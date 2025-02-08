package Tasks_4;

public class Task14 {
    public static void main(String[] args) {
        // Инициализация массива и целевого элемента для поиска
        int[] array = {10, 20, 30, 40, 50}; // Массив чисел
        int target = 30; // Целевой элемент для поиска

        // Вызов метода для поиска целевого элемента
        int index = linearSearch(array, target);

        // Если индекс равен -1, значит элемент не найден
        if (index == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден на позиции: " + index); // Выводим индекс найденного элемента
        }
    }

    // Метод для линейного поиска элемента в массиве
    public static int linearSearch(int[] array, int target) {
        // Перебор всех элементов массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) { // Если текущий элемент совпадает с целевым
                return i; // Возвращаем индекс найденного элемента
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }
}
