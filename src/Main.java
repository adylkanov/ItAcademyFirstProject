import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] boxWeights = {15, 17, 21};
        int totalWeight = 185;

        ArrayList<ArrayList<Integer>> waysToMakeWeight = new ArrayList<>();
        waysToMakeWeight.add(new ArrayList<>());
        waysToMakeWeight.get(0).add(0);

        for (int weight : boxWeights) {
            for (int i = weight; i <= totalWeight; i++) {
                if (waysToMakeWeight.size() <= i) {
                    waysToMakeWeight.add(new ArrayList<>());
                }
                for (int prevWeight : waysToMakeWeight.get(i - weight)) {
                    ArrayList<Integer> newCombination = new ArrayList<>(waysToMakeWeight.get(i - weight));
                    newCombination.add(weight);
                    waysToMakeWeight.get(i).addAll(newCombination);
                }
            }
        }

        for (int i = 0; i < waysToMakeWeight.get(totalWeight).size(); i += 3) {
            System.out.println((i / 3 + 1) + ": " + waysToMakeWeight.get(totalWeight).subList(i, i + 3));
        }
    }
}