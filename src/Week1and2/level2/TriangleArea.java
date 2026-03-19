package level2;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        double cmToInch = 2.54;
        double baseInch = base / cmToInch;
        double heightInch = height / cmToInch;
        double areaInch = 0.5 * baseInch * heightInch;

        System.out.println("Area in sq cm = " + areaCm);
        System.out.println("Area in sq inches = " + areaInch);

        input.close();
    }
}
