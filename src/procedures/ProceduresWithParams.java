package procedures;

import java.util.Scanner;

public class ProceduresWithParams {
    public static void main(String[] args) {
        printSum(10, 20, 30);
        printSum(1, 2, 3);
        average(10, 20);
        average(100, 0);
    }

    static void printSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
    }

    static void average(int num1, int num2) {
        int sum = (num1 + num2) / 2;
        System.out.println("Average: " + sum);
    }

}
