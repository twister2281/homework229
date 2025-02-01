package Tasks_5;

public class Task3 {
    public static void main(String[] args) {
        String sentence = "   процессор и информация";
        String[] words = sentence.trim().split(" ");
        String firstWord = words[0];
        
        int count = 0;
        for (char c : firstWord.toCharArray()) {
            if (c == 'о') count++;
        }
        
        System.out.println("Количество букв 'о' в первом слове: " + count);
    }
}
