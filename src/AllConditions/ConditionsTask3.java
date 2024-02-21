package AllConditions;

import java.util.Scanner;
public class ConditionsTask3 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in) ;
        System.out.println("Введите возвраст Антона");
        int antonAge = myScanner.nextInt();

        System.out.println("Anton's age " + antonAge);
        System.out.println("Введите возвраст Бориса");
        int borisAge = myScanner.nextInt();
        System.out.println("Boris' age " + borisAge);
        System.out.println("Введите возвраст Виктора");
        int victorAge = myScanner.nextInt();
        System.out.println("Victor's age " + victorAge);
        if (antonAge > borisAge && antonAge > victorAge) {
            System.out.println("Антон старше всех!");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            System.out.println("Борис старше всех!");
        } else if (victorAge > antonAge && victorAge > borisAge ) {
            System.out.println("Виктор старше всех!");
        } else if (antonAge > victorAge && antonAge == borisAge) {
            System.out.println("Антон и Борис старше Виктора!");
        } else if (antonAge > borisAge && antonAge == victorAge) {
            System.out.println("Антон и Виктор старше Бориса!");
        } else if (borisAge > antonAge && borisAge == victorAge) {
            System.out.println("Борис и Виктор старше Антона!");
        } else if (borisAge == antonAge && antonAge == victorAge) {
            System.out.println("Все одного возвраста!");
        } else {
            System.out.println("else");
        }
    }
}
