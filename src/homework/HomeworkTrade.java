package homework;

import java.util.Scanner;

public class HomeworkTrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите валюту (USD, EUR): ");
        String currency = scanner.nextLine();

        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();

        System.out.print("Введите тип операции (покупка или продажа) :");
        String operation = scanner.next();

        double result = 0;

        if (operation.equals("покупка")) {
            result = convertToKGS(currency, amount);
        } else if (operation.equals("продажа")) {
            result = convertFromKGS(currency, amount);
        } else {
            System.out.println("Неправильно введен тип операции.");
            return;
        }

        if (result < 0) {
            System.out.println("Сумма превышает лимит в 200 тысяч сом. Отказано в операции.");
        } else {
            System.out.println("Результат: " + result + " сом");
        }
    }

    public static double convertToKGS(String currency, double amount) {
        double rate = getExchangeRate(currency);
        return amount * rate;
    }

    public static double convertFromKGS(String currency, double amount) {
        double rate = getExchangeRate(currency);
        return amount / rate;
    }

    public static double getExchangeRate(String currency) {
        if (currency.equals("USD")) {
            return 90;
        } else if (currency.equals("EUR")) {
            return 100;
        } else {
            System.out.println("Курс для указанной валюты не найден.");
            return 0;
        }
    }
}
