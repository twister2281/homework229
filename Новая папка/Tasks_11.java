import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class FileOperations {
    
    // 1. Чтение файла и вывод в консоль
    public static void readFile(String filename) throws IOException {
        Files.lines(Path.of(filename)).forEach(System.out::println);
    }
    
    // 2. Подсчет строк в файле
    public static long countLines(String filename) throws IOException {
        return Files.lines(Path.of(filename)).count();
    }
    
    // 3. Чтение файла с номерами строк
    public static void readFileWithNumbers(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filename));
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ". " + lines.get(i));
        }
    }
    
    // 4. Подсчет вхождений слова
    public static long countWordOccurrences(String filename, String word) throws IOException {
        return Files.lines(Path.of(filename))
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .filter(w -> w.equalsIgnoreCase(word))
                .count();
    }
    
    // 5. Копирование файла
    public static void copyFile(String source, String destination) throws IOException {
        Files.copy(Path.of(source), Path.of(destination), StandardCopyOption.REPLACE_EXISTING);
    }
    
    // 6. Подсчет слов в файле
    public static long countWords(String filename) throws IOException {
        return Files.lines(Path.of(filename))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .count();
    }
    
    // 7. Замена слова в файле
    public static void replaceWord(String filename, String target, String replacement, String output) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filename));
        List<String> modifiedLines = new ArrayList<>();
        for (String line : lines) {
            modifiedLines.add(line.replaceAll(target, replacement));
        }
        Files.write(Path.of(output), modifiedLines);
    }
    
    // 8. Деление с обработкой деления на 0
    public static void safeDivide(int a, int b) {
        try {
            System.out.println("Результат: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        }
    }
    
    // 9. Чтение файла с обработкой ошибки
    public static void readFileWithErrorHandling() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = scanner.nextLine();
            try {
                readFile(path);
                break;
            } catch (IOException e) {
                System.out.println("Ошибка: Файл не найден. Попробуйте снова.");
            }
        }
    }
    
    // 10. Деление с двумя обработками исключений
    public static void safeDivideWithExceptions(String num1, String num2) {
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            safeDivide(a, b);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный ввод числа!");
        }
    }
    
    // 11. Преобразование массива строк в числа
    public static void parseNumbers(String[] arr) {
        for (String s : arr) {
            try {
                System.out.println(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования: " + s);
            }
        }
    }
    
    // 12. Исключение для отрицательных чисел
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
    
    public static void checkNegativeNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Ошибка: отрицательное число!");
        }
    }
    
    // 13. Чтение файла с исключениями
    static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }
    
    public static void readFileWithExceptions(String filename) throws IOException, EmptyFileException {
        List<String> lines = Files.readAllLines(Path.of(filename));
        if (lines.isEmpty()) throw new EmptyFileException("Ошибка: файл пуст!");
        
        for (int i = 0; i < lines.size(); i++) {
            try {
                Integer.parseInt(lines.get(i));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка в строке " + (i + 1));
            }
        }
    }
    
    // 14-18. Регулярные выражения
    public static boolean isEmail(String str) {
        return str.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
    
    public static boolean isPhoneNumber(String str) {
        return str.matches("\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}");
    }
    
    public static List<String> extractDates(String text) {
        Matcher matcher = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}\\b").matcher(text);
        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
    
    public static List<String> extractCapitalWords(String text) {
        Matcher matcher = Pattern.compile("\\b[A-ZА-Я][a-zа-я]*\\b").matcher(text);
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
    
    public static boolean isOnlyDigits(String str) {
        return str.matches("\\d+");
    }
}
