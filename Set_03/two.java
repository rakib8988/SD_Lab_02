import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        if (word.length() > 10) {

            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            int middleCount = word.length() - 2;

            System.out.println("" + first + middleCount + last);

        } else {

            System.out.println(word);

        }
    }
}