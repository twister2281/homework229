package Tasks_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArrayList<Integer> multiplesOfThree = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> nonPositiveNumbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) multiplesOfThree.add(array[i][j]);
                if (array[i][j] > 0) positiveNumbers.add(array[i][j]);
                else nonPositiveNumbers.add(array[i][j]);
            }
        }

        System.out.println("Элементы, кратные трем: " + multiplesOfThree);
        System.out.println("Положительные элементы: " + positiveNumbers);
        System.out.println("Неположительные элементы: " + nonPositiveNumbers);
    }
}
