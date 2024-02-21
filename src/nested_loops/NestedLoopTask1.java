package nested_loops;

public class NestedLoopTask1 {
    public static void main(String[] args) {

        boolean notsimple = false;
        for ( int i = 2; i < 1000; i++) {
            for ( int j = 3; j > i; i--) {
                if (i % j == 0) notsimple = true;

            }

        }
    }
}
