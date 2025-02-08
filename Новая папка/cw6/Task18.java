public class Task18 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "hello world done";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с маленькой буквы и заканчивается на слово "done"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и имеет минимальную длину (минимум 5 символов)
        if (str == null || str.length() < 5) {
            return false;
        }

        // Проверяем, что строка начинается с маленькой буквы
        if (!Character.isLowerCase(str.charAt(0))) {
            return false;
        }

        // Проверяем, что строка заканчивается словом "done"
        if (!str.endsWith("done")) {
            return false;
        }

        return true; // Все проверки прошли успешно
    }
}
