package functions;

import java.util.Scanner;

public class FunctionExample2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = calculateSumOfDigitsInNumber(num);

        if (sum >= 50) {
            System.out.println("Cумма цифр в числе больше 50");
        } else {
            System.out.println("Cумма цифр в числе меньше или равна 50");
        }
    }

    static int calculateSumOfDigitsInNumber(int num) {

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}