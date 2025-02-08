public class Task17 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = " hello world exit";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с пробела и заканчивается словом "exit"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и имеет минимальную длину (пробел + слово "exit")
        if (str == null || str.length() < 6) {
            return false;
        }

        // Проверяем, что строка начинается с пробела
        if (str.charAt(0) != ' ') {
            return false;
        }

        // Проверяем, что строка заканчивается словом "exit"
        if (!str.endsWith("exit")) {
            return false;
        }

        return true; // Все проверки прошли успешно
    }
}
