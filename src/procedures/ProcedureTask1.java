package procedures;

import java.util.Scanner;

public class ProcedureTask1 {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    static void printMultiplicationTable() {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int a = 0; a <= 10; a++) {
            System.out.println(number + " * " + a + " = " + a * number);

        }
    }

    static void showError() {
        System.out.println("Ошибка программы");
    }

}
