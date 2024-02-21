package cycles;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
       while (true) {
           System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in) ;
            int num = scanner.nextInt();
           int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;

            }
           System.out.println("Количетсво цифр в числе: " + count);
        }
    }
}
