package Tasks11;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class AllTasks {

    // 1. Читает все строки файла и выводит их в консоль
    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // 2. Считает количество строк в файле
    public static void countLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int count = 0;
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Количество строк в файле: " + count);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // 3. Читает текстовый файл построчно и выводит его содержимое в консоль с номерами строк
    public static void readFileWithLineNumbers(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // 4. Проверяет, встречается ли слово в тексте
    public static void checkWordInFile(String filePath, String word) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, word);
            }
            System.out.println("Количество вхождений слова '" + word + "': " + count);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // Метод для подсчета вхождений слова в строке
    private static int countOccurrences(String line, String word) {
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }

    // 5. Читает содержимое из одного файла и записывает его в другой
    public static void copyFile(String sourcePath, String destPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }

    // 6. Считает количество слов в файле
    public static void countWordsInFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length; // разделение по пробелам
            }
            System.out.println("Количество слов в файле: " + wordCount);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // 7. Заменяет слово на другое в тексте файла и записывает в новый файл
    public static void replaceWordInFile(String sourcePath, String destPath, String oldWord, String newWord) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace(oldWord, newWord);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }

    // 8. Принимает два числа и делит одно на другое, обрабатывая деление на ноль
    public static void divideNumbers() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
        }
    }

    // 9. Читает файл и обрабатывает ошибку, если файл не найден
    public static void readFileWithErrorHandling(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. Укажите правильный путь.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // 10. Делит два числа и обрабатывает исключения
    public static void divideWithExceptions() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Результат: " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный ввод числа");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }

    // 11. Преобразует массив строк в числа
    public static void convertStringsToNumbers(String[] strings) {
        for (String str : strings) {
            try {
                int num = Integer.parseInt(str);
                System.out.println("Число: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки '" + str + "' в число");
            }
        }
    }

    // 12. Создание исключения NegativeNumberException
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    // Метод для обработки исключения NegativeNumberException
    public static void checkForNegativeNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Ошибка: введено отрицательное число");
        }
    }

    // 13. Обработка исключений при чтении файла
    public static void readFileWithCustomExceptions(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                try {
                    Integer.parseInt(line); // Проверяем, может ли строка быть числом
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка на строке " + lineNumber + ": не число");
                }
                lineNumber++;
            }
            if (lineNumber == 1) {
                throw new Exception("Файл пуст");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // 14. Регулярное выражение для проверки почтового адреса
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    // 15. Регулярное выражение для номера телефона
    public static boolean isValidPhoneNumber(String phone) {
        String regex = "^\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}$";
        return phone.matches(regex);
    }

    // 16. Извлечение всех дат в формате DD.MM.YYYY
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    // 17. Регулярное выражение для поиска слов с заглавной буквы
    public static List<String> findCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[A-ZА-Я][a-zа-я]*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    // 18. Проверка, состоит ли строка только из цифр
    public static boolean isAllDigits(String text) {
        return text.matches("\\d+");
    }

    public static void main(String[] args) {
        // Пример вызова методов
        // Чтение файла
        readFile("test.txt");
        countLines("test.txt");
        readFileWithLineNumbers("test.txt");
        checkWordInFile("test.txt", "java");
        copyFile("test.txt", "copy.txt");
        countWordsInFile("test.txt");
        replaceWordInFile("test.txt", "output.txt", "java", "python");
        divideNumbers();
        readFileWithErrorHandling("nonexistent.txt");
        divideWithExceptions();

        String[] strings = {"123", "abc", "456"};
        convertStringsToNumbers(strings);

        try {
            checkForNegativeNumber(-1);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        readFileWithCustomExceptions("test.txt");

        System.out.println(isValidEmail("example@mail.com"));
        System.out.println(isValidPhoneNumber("+7-123-456-78-90"));

        String text = "01.01.2020 and 31.12.2025";
        System.out.println(extractDates(text));

        text = "Сегодня отличный День для прогулки";
        System.out.println(findCapitalizedWords(text));

        System.out.println(isAllDigits("12345"));
    }
}
