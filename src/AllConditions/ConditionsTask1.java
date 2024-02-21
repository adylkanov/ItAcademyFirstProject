package AllConditions;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConditionsTask1 {
    public static void main(String[] args) {
        String a = showInputDialog(null, "Введите первое число ");
        String b = showInputDialog(null, "Введите вторую число ");

        int c = Integer.parseInt(b);
        int d = Integer.parseInt(a);

        if (c > d) {
            showMessageDialog(null, "c > d ");



        } else if ( d > c) {
            showMessageDialog(null," d > c");
        }
    }
}