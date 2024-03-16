package arrays;

import java.util.Random;


public class JeggedArray {
    public static void main(String[] args) {
        int[][] numbers = new int[5][];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[random.nextInt(5) + 1];
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(256);
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
