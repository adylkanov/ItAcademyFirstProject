package main;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result;
             String operation = scanner.next();
             switch (operation) {
                 case "+" :
                     result = num1 + num2;
                     break;
                 case "-" :
                     result = num1 - num2;
                     break;
                 case "*" :
                     result = num1 * num2;
                     break;
                 case "/" :
                     result = num1 / num2;
                     break;

                 default:
                     result = 0;

             }
        System.out.println(num1 + " " + operation + " = " + result);
    }
}
