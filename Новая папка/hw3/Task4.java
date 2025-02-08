// Задача 4. Определение количества одинаковых символов в начале последовательности
public class Task4 {
    public static void main(String[] args) {
        String sequence = "aaaaabbbcc"; // Пример последовательности

        // Переменная для хранения количества одинаковых символов в начале
        int countSameStart = 0;

        // Проверяем, что последовательность не пуста
        if (sequence.length() > 0) {
            char firstChar = sequence.charAt(0); // Берем первый символ

            // Идем по всей последовательности и считаем одинаковые символы в начале
            for (int i = 0; i < sequence.length(); i++) {
                if (sequence.charAt(i) == firstChar) { // Если символ такой же, как первый
                    countSameStart++;
                } else {
                    break; // Как только символ отличается, завершаем подсчет
                }
            }
        }

        // Выводим результат
        System.out.println("Количество одинаковых символов в начале последовательности: " + countSameStart);
    }
}
