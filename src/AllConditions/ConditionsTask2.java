package AllConditions;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class ConditionsTask2 {
    public static void main(String[] args) {
        String a = showInputDialog(null, "Введите первое число ");
        String b = showInputDialog(null, "Введите вторую число ");
        String e = showInputDialog(null,"Введите третья число ");

        int c = Integer.parseInt(b);
        int d = Integer.parseInt(a);
        int g = Integer.parseInt(e);

        if (c > d )  {
            showMessageDialog(null, c + " > ");

        } else if ( d > g ) {
            showMessageDialog(null,d + " > ");

        } else if ( g > c ) {
            showMessageDialog(null,g + " > ");

        }
    }
}



