import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.print("Start index: ");
        int start = sc.nextInt();

        System.out.print("End index: ");
        int end = sc.nextInt();

        String custom = createSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Custom substring: " + custom);
        System.out.println("Built-in substring: " + builtin);
        System.out.println("Equal? " + custom.equals(builtin));
    }
}