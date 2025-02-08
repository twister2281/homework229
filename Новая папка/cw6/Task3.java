public class Task3 {
    public static void main(String[] args) {
        // Пример строки для поиска самого длинного слова
        String str = "Я учусь в университете и хочу стать программистом";

        // Находим самое длинное слово в строке
        String longestWord = findLongestWord(str);

        // Выводим результат
        System.out.println("Самое длинное слово: " + longestWord);
    }

    // Метод для нахождения самого длинного слова
    public static String findLongestWord(String str) {
        // Разделяем строку на слова, используя пробелы как разделители
        String[] words = str.split("\\s+");

        // Переменная для хранения самого длинного слова
        String longestWord = "";

        // Проходим по всем словам и находим самое длинное
        for (String word : words) {
            // Если текущее слово длиннее найденного, обновляем самое длинное слово
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
