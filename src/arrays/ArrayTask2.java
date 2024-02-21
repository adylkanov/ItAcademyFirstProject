package arrays;

import java.util.Random;

public class ArrayTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 100;
        int sum = 0;
        int N = 10;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
           sum = sum + array[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.println("array [ " + i + " ] = " + array[i]);
        }
        float average = (float) sum / N;
        System.out.println("Среднее арфиметическое: " + average);
    }
}
