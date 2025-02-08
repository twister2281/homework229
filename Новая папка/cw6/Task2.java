import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // Пример текста для поиска телефонных номеров
        String text = "Контактные номера: (123) 456-7890, 987-654-3210 и (555) 123-4567.";

        // Ищем все телефонные номера
        List<String> phoneNumbers = findPhoneNumbers(text);

        // Выводим найденные номера
        System.out.println("Найденные номера телефонов:");
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
    }

    // Метод для поиска телефонных номеров в тексте
    public static List<String> findPhoneNumbers(String text) {
        List<String> phoneNumbers = new ArrayList<>();

        // Разделяем текст на слова
        String[] words = text.split("[\\s,;:.!?]+");

        // Проходим по каждому слову
        for (String word : words) {
            // Проверяем, является ли слово телефонным номером
            if (isValidPhoneNumber(word)) {
                phoneNumbers.add(word);
            }
        }

        return phoneNumbers;
    }

    // Метод для проверки, является ли строка валидным телефонным номером
    public static boolean isValidPhoneNumber(String str) {
        // Убираем все пробелы из строки для удобства
        str = str.replaceAll("\\s", "");

        // Проверяем формат телефонного номера
        // Возможные форматы: (123) 456-7890 или 123-456-7890
        if ((str.matches("\\(\\d{3}\\) \\d{3}-\\d{4}") || str.matches("\\d{3}-\\d{3}-\\d{4}"))) {
            return true;
        }
        return false;
    }
}
