// Задача 7. Определение количества букв "о" в первом слове предложения
public class Task7 {
    public static void main(String[] args) {
        String sentence = "   Обычное предложение, в котором нужно посчитать буквы о."; // Пример предложения

        // Убираем начальные пробелы и разделяем предложение на слова
        sentence = sentence.trim(); // Убираем пробелы в начале и конце
        String[] words = sentence.split("\\s+"); // Разделяем по пробелам

        // Переменная для хранения количества букв "о"
        int countO = 0;

        // Перебираем буквы первого слова
        if (words.length > 0) { // Проверяем, что слова есть
            String firstWord = words[0]; // Первое слово

            // Перебираем символы первого слова
            for (int i = 0; i < firstWord.length(); i++) {
                if (firstWord.charAt(i) == 'о') { // Проверяем, является ли символ буквой "о"
                    countO++;
                }
            }
        }

        // Выводим результат
        System.out.println("Количество букв 'о' в первом слове: " + countO);
    }
}
