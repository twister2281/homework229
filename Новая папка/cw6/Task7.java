public class Task7 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Это тестовый вопрос?";

        // Проверяем строку
        boolean isValid = isValidQuestionString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка содержит более 5 символов и заканчивается знаком "?"
    public static boolean isValidQuestionString(String str) {
        // Проверяем, что строка не пуста и длина больше 5 символов
        if (str == null || str.length() <= 5) {
            return false;
        }

        // Проверяем, что строка заканчивается знаком "?"
        return str.charAt(str.length() - 1) == '?';
    }
}
