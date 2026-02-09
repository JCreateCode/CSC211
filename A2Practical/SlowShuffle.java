import java.util.Random;
public class SlowShuffle {
    public static int[] shuffle(int N) {
        Random rand = new Random();
        int[] shuffled = new int[N];
        boolean[] isNotPresent = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            isNotPresent[i] = true;
        }
        int i = 0;
        while (i < N - 1) {
            int r = rand.nextInt(N) + 1;

            if (isNotPresent[r]) {
                shuffled[i] = r;
                isNotPresent[r] = false;
                i++;
            }
        }
        for (int r = 1; r <= N; r++) {
            if (isNotPresent[r]) {
                shuffled[N - 1] = r;
                break;
            }
        }

        return shuffled;
    }
}
