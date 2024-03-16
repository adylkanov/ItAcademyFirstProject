package triangles;

public class Task {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 10;
        rectangle1.width = 5;
        System.out.println(" -_-   :)   square: " + rectangle1.calculatesquare() );

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(15);
        rectangle2.setWidth(20);
        System.out.println( "\n ._.   :(   square: " + rectangle2.calculatesquare());

        System.out.println("\n     o_o");
    }
}
