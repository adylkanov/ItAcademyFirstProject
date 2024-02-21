package homework;

import java.util.Scanner;

public class Homework002 {
    public static void main(String[] args) {

        int number;
        int count = 0;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String num = scanner.nextLine();
            if (num.equals("0")) {
                break;
            }
            count++;
            sum += Integer.parseInt(num);
        }
        System.out.println("Количество введенных чисел: " + count);
        System.out.println("Сумма введенных чисел: " + sum);

        if (count > 0) {
            float average = (float) sum / count;
            System.out.println("Среднее арфиметическое: " + average);
        }







    }
}



