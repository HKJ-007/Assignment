import java.util.Scanner;

public class WordSplitter {

    public static void splitWords(String text) {

        String word = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {

                word += text.charAt(i);

            } else {

                System.out.println(word);
                word = "";
            }
        }

        System.out.println(word);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        splitWords(text);
    }
}