package homework;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: " );
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3 ) {
            System.out.println("Все числа одинаковые ");
        } else if (number3 == number2 ) {
            System.out.println("Два числа одинаковые " + number3 + " и " + number2 );
        } else if (number3 == number1 ) {
            System.out.println("Два числа одинаковые " + number3 + " и " + number1);
        } else if (number2 == number1) {
            System.out.println("Два числа одинаковые " + number2 + " и " + number1);
        } else  {
            System.out.println("Нет одинаковых чисел ");
        }
    }
}












