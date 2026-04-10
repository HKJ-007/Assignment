import java.util.Scanner;

public class HarshadFrequency {

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int getSum(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static boolean isHarshad(int num, int sum) {
        return num % sum == 0;
    }

    public static int[][] getFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);
        int sum = getSum(digits);

        System.out.println("Harshad Number = " + isHarshad(num, sum));

        int[][] freq = getFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
        }
    }
}