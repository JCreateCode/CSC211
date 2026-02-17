import java.util.Random;
public class UnbiasedShuffle {
    public static int[] shuffle(int N) {
        Random rand = new Random();
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            B[i] = i + 1;
        }

        int b = 0;
        while (b < N) {
            int r = rand.nextInt(N - b) + b;
            int temp = B[b];
            B[b] = B[r];
            B[r] = temp;
            b++;
        }

        return B;
    }
}
