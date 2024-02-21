package main;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in) ;
        String a = myScanner.nextLine();

        System.out.println("I wrote " + a);
        String b = myScanner.nextLine();
        System.out.println("I wrote " + b);
        String c = a + b;
        System.out.println("Sum " + c);

    }

}
