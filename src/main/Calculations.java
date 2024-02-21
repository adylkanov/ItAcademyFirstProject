package main;

public class Calculations {
    public static void main(String[] args) {
        int b = 1;
                int c = 2;
                        int d = 3;
        double a = 100 - ((( b + c ) * 2 * 3 - 10) / (2 * ( 4 + d ))) * d;
        System.out.println(a);
        int number1 = 1;
        int number2 = 10;
                int number3 = 20;
                        int number4 = 30;
                        int number5 = 40;
                        number1 ++;
                        number2 --;
        number5 /= number3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number5);
        System.out.println(number4);

        float a1 = 1.f / 8.f;
        System.out.println(a1);
        System.out.printf("%f \n", a1);
        System.out.printf("%.2f \n", a1);
        System.out.printf("%.3f \n", a1);
        System.out.printf("%.4f \n", a1);

        int number6 = 100;
        int abs = Math.abs(number6);
        System.out.println(abs);
        double sqrt = Math.sqrt(16);
        System.out.println(sqrt);
        double sin = Math.sin(3.14 / 2);
        System.out.println(sin);
        double pow = Math.pow(2, 9);
        System.out.println("pow = " + pow);





    }
}