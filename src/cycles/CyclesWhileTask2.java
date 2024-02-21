package cycles;

import java.util.Scanner;

public class CyclesWhileTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             System.out.println("Введите натуральное число: ");
        int num;
              num = scanner.nextInt();
              boolean hasNumbersNear = false;
        do {
            int lastDigit = num % 10;
            num = num / 10;
            int preLastDigit = num % 10;
            if (lastDigit == preLastDigit) {
                hasNumbersNear = true;
break;
            }
        } while (num > 0);
        if (hasNumbersNear ) {
            System.out.println("Есть одинаковые цифры стоящие рядом ");
        } else {
            System.out.println("Нет одинаковых цифр стоящих рядом ");
        }
    }
}
