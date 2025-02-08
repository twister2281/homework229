package Tasks_4;

public class Task11 {
    public static void main(String[] args) {
        int rows = 4; // Указываем количество строк
        int[][] array = new int[rows][]; // Создаем массив с переменным количеством столбцов

        // Заполнение массива произведениями индексов строки и столбца
        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1]; // Для каждой строки выделяем массив, количество элементов зависит от строки
            for (int j = 0; j <= i; j++) {
                array[i][j] = i * j; // Элемент массива равен произведению индексов строки и столбца
            }
        }

        // Вывод массива на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " "); // Печатаем элементы текущей строки
            }
            System.out.println(); // Переход на новую строку после вывода элементов
        }
    }
}
