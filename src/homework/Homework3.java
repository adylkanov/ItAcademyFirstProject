package homework;
    import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
public class Homework3 {
    public static void main (String[] args) {
        String f = showInputDialog("Введите первое число: ");
        String t = showInputDialog("Введите второе число: ");

        int a = Integer.parseInt(f);
        int b = Integer.parseInt(t);

        double i = 0;
        int c = 0;
        if (a >= 0) {
            while (i != a) {
                c += b;
                i++;
            }
        } else {
            while (i != b & i != -b) {
                c += a;
                i++;
            }
        }
        showMessageDialog(null, a + " * " + b + " = " + c);
    }
}


