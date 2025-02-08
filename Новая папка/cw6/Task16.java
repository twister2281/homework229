public class Task16 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "#1234 done";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с символа "#" и заканчивается словом "done"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и имеет минимальную длину (символ # + "done")
        if (str == null || str.length() < 6) {
            return false;
        }

        // Проверяем, что строка начинается с символа '#'
        if (str.charAt(0) != '#') {
            return false;
        }

        // Проверяем, что строка заканчивается словом "done"
        if (!str.endsWith("done")) {
            return false;
        }

        return true; // Все проверки прошли успешно
    }
}
