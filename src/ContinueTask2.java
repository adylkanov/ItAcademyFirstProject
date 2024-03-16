public class ContinueTask2 {
    public static void main(String[] args) {
        calculateSum(2,6,4);
        calculateSum(5,4,8,9,1);
        calculateSum(1,8,9,6,2,3,4);
        calculateSum(5,2,3,4);
    }

    static void calculateSum(int... nums) {
        int result = 0;
        for (int i : nums) {
            if (i % 2 == 0)
                continue;
            int addNumberSquare = i * i;
            result += addNumberSquare;
            System.out.println("Amount of numbers: " + nums.length + "\t Sum of add numbers: " + result);

        }
    }
}
