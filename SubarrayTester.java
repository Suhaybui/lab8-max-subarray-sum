import java.util.Random;

public class SubarrayTester {

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000};

        System.out.println("--- Maximum Subarray Sum Algorithm Comparison ---");

        for (int n : sizes) {
            System.out.println("\nArray Size: " + n);

            int[] arr = generateRandomArrayWithNegatives(n);

            long start = System.nanoTime();
            int bruteSum = MaxSubarraySolver.bruteForceMaxSum(arr);
            long end = System.nanoTime();
            System.out.println("Brute Force Result: " + bruteSum + " | Time: " + (end - start) + " ns");

            start = System.nanoTime();
            int kadaneSum = MaxSubarraySolver.kadanesAlgorithmMaxSum(arr);
            end = System.nanoTime();
            System.out.println("Kadane Result: " + kadaneSum + " | Time: " + (end - start) + " ns");
        }
    }

    public static int[] generateRandomArrayWithNegatives(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(200001) - 100000;
        }
        return arr;
    }
}
