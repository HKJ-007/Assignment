import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int[] freq = new int[10];

        while (num != 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                System.out.println(i + " occurs " + freq[i] + " times");
        }

        input.close();
    }
}