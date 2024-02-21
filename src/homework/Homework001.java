package homework;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;

public class Homework001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, для которого вы хотите увидеть таблицу умножения: ");
        int NumUser = sc.nextInt();
        int ten = 10;
        for (int i = 0; i  <= ten; i++ ) {

                int result = i * NumUser;
                System.out.println(NumUser + " * " + i + " = " + result);

        }

    }
}
