package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введеите число Х: ");
        int x = scanner.nextInt();
        int nX = -1;
        int size = 10;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(6);
            System.out.println("numbers[" + i + "] = " + numbers[i]);


        }
        for (int i = 0; i < size; i++) {

            if (numbers[i] == x) {
                nX = i;
                System.out.println("Found number[" + nX + "] = " + numbers[nX]);
            }
        }

    }   {
        System.out.println("Не нашли! ");
    }
}

