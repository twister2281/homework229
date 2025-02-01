package Tasks_5;

public class Task5 {
    public static void main(String[] args) {
        String word1 = "процессор";
        String word2 = "информация";
        
        for (char c : word1.toCharArray()) {
            if (word2.contains(String.valueOf(c))) {
                System.out.print("да ");
            } else {
                System.out.print("нет ");
            }
        }
    }
}
