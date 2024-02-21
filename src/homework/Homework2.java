package homework;


import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите первое число");
        int b = sc.nextInt();
        System.out.println("Введите второе число");
        int c = sc.nextInt();
        System.out.println("Введите третье число");
        int d = sc.nextInt();
        System.out.println("Введите четвертое число");
        int e = sc.nextInt();
        System.out.println("Введите пятое число");

        if (a > b && a > c && a > d && a > e) ;
        {
            System.out.println("Самое большое число");
        }
        if (b > a && b > c && b > d && b > e)
        {
            System.out.println("Самое большое число");
        }

        else if (c > a && c > b && c > d && c > e)
        {
            System.out.println("Самое большое число");
        }
        else if(d > a && d > b && d > c && d > e)
        {
            System.out.println("Самое большое число");
        }
        else if (e > a && e > b && e > c && e > d)
        {
            System.out.println("Все числа равны");
        }



    }
}
