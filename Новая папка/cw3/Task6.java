public class Task6 {
    public static void main(String[] args) {
        // Начальные параметры для арифметической прогрессии
        int a = 2; // Первый элемент прогрессии
        int p = 3; // Шаг прогрессии

        // Создаем массив для хранения 10 элементов арифметической прогрессии
        int[] arithmeticProgression = new int[10];
        
        // Заполняем массив арифметической прогрессии
        for (int i = 0; i < arithmeticProgression.length; i++) {
            arithmeticProgression[i] = a + i * p; // Формула для нахождения элемента прогрессии
        }
        
        // Выводим элементы арифметической прогрессии
        System.out.println("Арифметическая прогрессия: ");
        for (int num : arithmeticProgression) {
            System.out.print(num + " "); // Печатаем каждый элемент массива
        }
        System.out.println(); // Переход на новую строку после вывода прогрессии


        // Создаем массив для последовательности Фибоначчи (20 чисел)
        int[] fibonacci = new int[20];
        
        // Начальные значения для последовательности Фибоначчи
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Заполняем оставшиеся элементы последовательности Фибоначчи
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Следующее число равно сумме двух предыдущих
        }
        
        // Выводим элементы последовательности Фибоначчи
        System.out.println("Последовательность Фибоначчи: ");
        for (int num : fibonacci) {
            System.out.print(num + " "); // Печатаем каждый элемент последовательности
        }
    }
}
