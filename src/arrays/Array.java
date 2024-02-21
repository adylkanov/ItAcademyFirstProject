package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int size = 10;
        int [] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = i*i;
            System.out.println(numbers[i]);
        }

    }
}
