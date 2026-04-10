import java.util.Random;

public class PlayerHeights {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < min) min = x;
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nMean = " + getMean(heights));
        System.out.println("Shortest = " + getMin(heights));
        System.out.println("Tallest = " + getMax(heights));
    }
}