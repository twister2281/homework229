import java.io.*;

public class Task2 {

    public static void replaceWordInFile(String sourcePath, String destPath, String oldWord, String newWord) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace(oldWord, newWord);  // Заменяем старое слово на новое
                writer.write(line);
                writer.newLine();  // Переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        replaceWordInFile("source.txt", "output.txt", "oldWord", "newWord");  // Пример вызова метода
    }
}
