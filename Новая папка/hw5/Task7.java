import java.util.*;
import java.util.regex.*;

public class Task7 {

    public static List<String> findCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[A-ZА-Я][a-zа-я]*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String text = "Сегодня отличный День для прогулки";
        List<String> capitalizedWords = findCapitalizedWords(text);
        System.out.println("Слова с заглавной буквы: " + capitalizedWords);
    }
}
