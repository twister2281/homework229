// Задача 9. Определение количества слов в предложении
public class Task9 {
    public static void main(String[] args) {
        // Пример предложения
        String sentence = "   Это  пример    предложения   с   пробелами.  "; // Можно изменить для теста

        // 1. Случай без начальных и конечных пробелов
        String trimmedSentence = sentence.trim(); // Убираем начальные и конечные пробелы
        String[] words = trimmedSentence.split("\\s+"); // Разделяем строку на слова по одному или нескольким пробелам
        System.out.println("Количество слов (с пробелами в начале и в конце): " + words.length);

        // 2. Случай с начальными и конечными пробелами
        String[] wordsWithoutTrim = sentence.split("\\s+"); // Разделяем строку без удаления пробелов в начале и в конце
        System.out.println("Количество слов (с пробелами в начале и в конце): " + wordsWithoutTrim.length);
    }
}
