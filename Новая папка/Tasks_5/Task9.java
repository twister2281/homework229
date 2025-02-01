package Tasks_5;

public class Task9 {
    public static void main(String[] args) {
        String word = "abcdefghijklm";
        String firstPart = word.substring(0, 4);
        String secondPart = word.substring(4, 8);
        String thirdPart = word.substring(8);

        // а)
        String swappedA = thirdPart + secondPart + firstPart;
        System.out.println("Результат а): " + swappedA);

        // б)
        String swappedB = secondPart + thirdPart + firstPart;
        System.out.println("Результат б): " + swappedB);
    }
}
