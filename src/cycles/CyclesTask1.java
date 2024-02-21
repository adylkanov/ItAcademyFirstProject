package cycles;

import java.util.Scanner;

public class CyclesTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scanner.nextInt();

        System.out.println("Введите число B: ");
        int b = scanner.nextInt();

        while (0 < a && a <= b) {
            System.out.println("Квадраты натуральных чисел A: " + a * a);
            a ++;

        }
        }
    }

