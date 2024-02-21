import java.util.Random;


public class MatrixTask3 {
    public static void main(String[] args) {
        int size1 = 4;
        int size2 = 4;
        int[][] numbers = new int[size1][size2];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                numbers[i][j] = random.nextInt(255);
                sum += numbers[i][j];
                System.out.print( numbers[i][j] + " ");
            }
            System.out.println();
        }


        int average = sum / (size1 * size2);
        System.out.println("Средняя яркость: " + average);
        System.out.println("Результат: ");

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (numbers[i][j] < average)
                    numbers[i][j] = 0;
                else
                    numbers[i][j] = 255;
                System.out.print( numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
