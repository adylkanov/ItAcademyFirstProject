package constructors;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width and length of rectangle: ");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, length);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
    }
}