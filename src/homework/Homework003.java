package homework;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Homework003 {
    public static void main(String[] args) {
        int five = 5;
        String a = showInputDialog("Введите число, которое вы хотите умножить в 5 раз");
        int numUser = Integer.parseInt(a);
        for (int i = 0; i <= five; i++) ;
        {
            int result = 5 * numUser;
            showMessageDialog(null, "5 * " + numUser + " = " + result);
        }
    }
}

