package codingBat.logic1;

public class DateFashionTask {
    public static void main(String[] args) {
        System.out.println(dateFashion(1, 1));
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (you <= 3 || date <= 7 && you <= 7 || date <= 3) return 1;
        else if (you <= 10 || date <= 10) return 2;
        else return 0;


    }
}
