import java.util.*;

public class Task3 {

    public static void divideNumbers() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Результат деления: " + (a / b));  // Выполняем деление
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено некорректное число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }

    public static void main(String[] args) {
        divideNumbers();  // Пример вызова метода
    }
}
