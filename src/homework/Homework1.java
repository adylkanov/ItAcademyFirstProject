package homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        if (age % 10 == 1 && age % 100 != 11) {
            System.out.println("Вам " +  age + " год");
        } else if ((age % 10 >= 2 && age % 10 <= 4) && !(age % 100 >= 12 && age % 100 <= 14)) {
            System.out.println("Вам " + age + " года");
        } else {
            System.out.println("Вам " + age + " лет");
        }
    }
}
