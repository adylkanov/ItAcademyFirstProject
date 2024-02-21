package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = 10;
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
            System.out.println("Maccив A: ");
            for (int i = 0; i < N; i++) {
                System.out.println(A[i] + " ");
            }
        }
    }

