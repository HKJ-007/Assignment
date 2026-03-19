import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " Positive Even");
                else
                    System.out.println(arr[i] + " Positive Odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (arr[0] == arr[arr.length - 1])
            System.out.println("Equal");
        else if (arr[0] > arr[arr.length - 1])
            System.out.println("First greater");
        else
            System.out.println("Last greater");

        input.close();
    }
}