package functions;

public class FunctionExample1 {
    public static void main(String[] args) {
        int number = calculateSum(1, 2, 3);
        System.out.println("Сумма: " + number);
    }

    static int calculateSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
}
