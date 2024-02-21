package homework;

import java.util.Scanner;

public class Homework004 {
    public static void main(String[] args) {
        printProcedure();
    }

    static void printProcedure() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int a = scanner.nextInt();
        for (int count = 1; count <= a; count++) {
            System.out.print("-");
        }
    }
}
