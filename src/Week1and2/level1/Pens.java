package level1;

public class Pens {

    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent);
        System.out.println("The remaining pen not distributed is " + remainingPens);

    }
}