import java.util.Scanner;

public class SumValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = new double[10];
        int index = 0;
        double sum = 0;

        while (true) {
            System.out.print("Enter number: ");
            double value = input.nextDouble();

            if (value <= 0 || index == 10)
                break;

            arr[index] = value;
            index++;
        }

        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        input.close();
    }
}