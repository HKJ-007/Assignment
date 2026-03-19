import java.util.Scanner;

public class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }

        input.close();
    }
}