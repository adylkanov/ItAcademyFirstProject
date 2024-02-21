package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите минимальное число: ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальное число: ");
        int max = scanner.nextInt();

        int N = 10;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("A[" + i + "] = ");
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        System.out.println("Массив A: ");
        for (int i = 0; i < N; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));
    }
}
