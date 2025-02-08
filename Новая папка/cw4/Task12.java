package Tasks_4;

public class Task12 {
    public static void main(String[] args) {
        int rows = 3; // Количество строк в массиве
        int[][] array = new int[rows][]; // Создаем массив с переменным количеством столбцов

        // Инициализация элементов массива
        array[0] = new int[] {1}; // Первая строка содержит один элемент
        array[1] = new int[] {2, 3}; // Вторая строка содержит два элемента
        array[2] = new int[] {4, 5, 6}; // Третья строка содержит три элемента

        // Вызов метода для вычисления суммы элементов массива
        int sum = sumElements(array);
        System.out.println("Сумма всех элементов: " + sum); // Вывод суммы элементов
    }

    // Метод для вычисления суммы всех элементов массива
    public static int sumElements(int[][] array) {
        int sum = 0; // Переменная для хранения суммы
        for (int i = 0; i < array.length; i++) { // Проходим по строкам массива
            for (int j = 0; j < array[i].length; j++) { // Проходим по столбцам текущей строки
                sum += array[i][j]; // Добавляем элемент в сумму
            }
        }
        return sum; // Возвращаем итоговую сумму
    }
}
