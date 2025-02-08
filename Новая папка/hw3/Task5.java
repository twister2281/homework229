// Задача 5. Нахождение порядкового номера максимальной цифры в тексте
public class Task5 {
    public static void main(String[] args) {
        String text = "   3 2 5 8 4 1 9 7"; // Пример текста

        // Убираем начальные пробелы и начинаем искать с первого символа, не являющегося пробелом
        text = text.trim(); // Убираем пробелы в начале

        int maxDigit = -1; // Переменная для хранения максимальной цифры
        int maxDigitPosition = -1; // Переменная для хранения позиции максимальной цифры
        int currentPosition = 1; // Считаем позицию начиная с 1

        // Перебираем все символы в строке
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Если текущий символ цифра
            if (Character.isDigit(ch)) {
                int digit = ch - '0'; // Преобразуем символ в цифру
                
                // Если эта цифра больше текущего максимума
                if (digit > maxDigit) {
                    maxDigit = digit; // Обновляем максимальную цифру
                    maxDigitPosition = currentPosition; // Обновляем позицию
                }
            }
            currentPosition++; // Увеличиваем позицию
        }

        // Выводим результат
        if (maxDigitPosition != -1) {
            System.out.println("Позиция максимальной цифры: " + maxDigitPosition);
        } else {
            System.out.println("Цифры не найдены.");
        }
    }
}
