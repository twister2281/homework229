// Задача 6. Проверка, является ли слово перевертышем
public class Task6 {
    public static void main(String[] args) {
        String word = "level"; // Пример слова

        // Преобразуем слово в нижний регистр для учета только букв
        word = word.toLowerCase();

        // Переменная для хранения флага, является ли слово перевертышем
        boolean isPalindrome = true;

        // Перебираем символы с начала и с конца
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false; // Если символы не совпадают, то слово не является перевертышем
                break; // Выходим из цикла
            }
        }

        // Выводим результат
        if (isPalindrome) {
            System.out.println("Слово является перевертышем.");
        } else {
            System.out.println("Слово не является перевертышем.");
        }
    }
}
