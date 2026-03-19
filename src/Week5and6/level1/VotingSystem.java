import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age");
                System.exit(0);
            }
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18)
                System.out.println("Student " + (i + 1) + " can vote");
            else
                System.out.println("Student " + (i + 1) + " cannot vote");
        }

        input.close();
    }
}