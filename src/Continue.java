public class Continue {
    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i;
            if (i % 2 == 0)
                continue;
            System.out.println(i * i);
        }

        for (int i : array) {
            if (i % 2 == 0)
                continue;
            System.out.println(i * i);

        }
    }
}

