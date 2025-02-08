public class Task9 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Start this process.";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с "Start" и заканчивается точкой
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и имеет хотя бы 6 символов
        if (str == null || str.length() < 6) {
            return false;
        }

        // Проверяем, что строка начинается с "Start"
        if (!str.startsWith("Start")) {
            return false;
        }

        // Проверяем, что строка заканчивается точкой
        return str.charAt(str.length() - 1) == '.';
    }
}
