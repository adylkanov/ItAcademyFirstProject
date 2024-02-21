package main;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MessageDialog {
    public static void main(String[] args) {
        showMessageDialog(null, "hophey lalaley");
        String text = showInputDialog("Enter the text");
        System.out.println("Я ввел этот текст " + text);
        int number = Integer.parseInt(text);
        System.out.println("123 " + text);
        int number2 = 100 + number;
        System.out.println(number2);
        String text2 = showInputDialog("Введите дробное число");
        double number3 = Double.parseDouble(text2);
        System.out.println(number3);
        double number4 = 10 + number3;
        System.out.println(number4);
        double sum = number + number3 + number2;
        System.out.println(number4 + number3 + number2);
        String result =
        "Первое число " + number + "\n"+
        "Второе число " + number2+ "\n"+
        "Третье число " + number3+ "\n"+
        "Сумма чисел " +sum;
        showMessageDialog(null,result);
    }
}