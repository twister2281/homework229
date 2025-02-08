import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Создаем массив из 15 элементов
        int[] array = new int[15];
        
        // Заполняем массив значениями от 1 до 15
        for (int i = 0; i < 15; i++) {
            array[i] = i + 1;  // Каждый элемент массива равен индексу + 1
        }

        // Создаем объект scanner для ввода значений
        Scanner scanner = new Scanner(System.in);

        // Вводим значение k
        System.out.print("Введите k: ");
        int k = scanner.nextInt();

        // Вводим значение s
        System.out.print("Введите s: ");
        int s = scanner.nextInt();

        // Переставляем элементы массива в пределах от индекса k+1 до s-1
        // Для этого используем два индекса: i (начинается с k+1) и j (начинается с s-1)
        for (int i = k + 1, j = s - 1; i < j; i++, j--) {
            int temp = array[i];  // Сохраняем элемент массива на позиции i в переменную temp
            array[i] = array[j];  // Перемещаем элемент на позиции j в позицию i
            array[j] = temp;  // Перемещаем элемент на позиции i в позицию j
        }

        // Выводим измененный массив
        for (int i : array) {
            System.out.print(i + " ");  // Печатаем каждый элемент массива
        }
    }
}
