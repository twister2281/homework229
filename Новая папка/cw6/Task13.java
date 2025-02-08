public class Task13 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Hello there, how are you?!";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с "Hello there" и заканчивается восклицательным знаком
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и ее длина больше или равна 13 символов (для "Hello there" + восклицательный знак)
        if (str == null || str.length() < 13) {
            return false;
        }

        // Проверяем, что строка начинается с фразы "Hello there"
        if (!str.startsWith("Hello there")) {
            return false;
        }

        // Проверяем, что строка заканчивается восклицательным знаком
        return str.charAt(str.length() - 1) == '!';
    }
}
