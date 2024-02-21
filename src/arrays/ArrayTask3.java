package arrays;

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            if (numbers[i] < 50) {
                sum1 += numbers[i];
                count1++;
            } else {
                sum2 += numbers[i];
                count2++;
            }
            System.out.println("Random numbers[" + i + "] = " + numbers[i]);
        }
      //  System.out.println("Average of random numbers from 0 to 49: %.2f \n", (float) sum1 / count1);
      //  System.out.println("Average of random numbers from 50 to 100: %.2f \n", (float) sum2 / count2);
    }
}

