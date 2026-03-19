import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        int[] years = new int[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = input.nextInt();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            double bonus = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus;

            totalBonus += bonus;
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);

        input.close();
    }
}