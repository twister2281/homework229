// Задача 8. Перестановка частей слова
public class Task8 {
    public static void main(String[] args) {
        String word = "abcdefghijk"; // Пример слова из 12 букв (должно быть 12 символов)

        // Убедимся, что длина слова равна 12
        if (word.length() != 12) {
            System.out.println("Слово должно состоять из 12 букв!");
            return;
        }

        // Разделяем слово на три части
        String firstPart = word.substring(0, 4); // Первая треть (символы 0-3)
        String secondPart = word.substring(4, 8); // Вторая треть (символы 4-7)
        String thirdPart = word.substring(8, 12); // Третья треть (символы 8-11)

        // а) первая треть на место третьей, вторая на место первой, третья на место второй
        String resultA = thirdPart + firstPart + secondPart;
        System.out.println("Результат (а): " + resultA);

        // б) первая треть на место второй, вторая на место третьей, третья на место первой
        String resultB = secondPart + thirdPart + firstPart;
        System.out.println("Результат (б): " + resultB);
    }
}
