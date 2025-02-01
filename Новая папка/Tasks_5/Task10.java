package Tasks_5;

public class Task10 {
    public static void main(String[] args) {
        String sentence = "   это пример предложения  ";
        
        String[] words = sentence.trim().split("\\s+");
        
        System.out.println("Количество слов в предложении: " + words.length);
    }
}
