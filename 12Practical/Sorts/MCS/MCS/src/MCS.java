public class MCS {
    public static int findMCS(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = findMCS(numbers);

        System.out.println("Maximum Contiguous Subarray Sum: " + result);
    }
}
