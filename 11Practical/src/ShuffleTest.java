import java.util.HashMap;

public class ShuffleTest {
    public static void experiment(String type) {
        HashMap<String, Integer> D = new HashMap<>();

        for (int i = 0; i < 60000; i++) {
            int[] result;

            if (type.equals("biased")) {
                result = BiasedShuffle.shuffle(3);
            } else {
                result = UnbiasedShuffle.shuffle(3);
            }

            String key = "" + result[0] + result[1] + result[2];

            if (!D.containsKey(key)) {
                D.put(key, 1);
            } else {
                D.put(key, D.get(key) + 1);
            }
        }

        System.out.println("\n" + type + " shuffle results:");
        for (String key : D.keySet()) {
            System.out.println(key + " " + D.get(key));
        }
    }

    public static void main(String[] args) {

        experiment("biased");
        experiment("unbiased");
    }

}