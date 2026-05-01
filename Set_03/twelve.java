import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of children: ");
        int N = input.nextInt();

        System.out.print("Enter existing candies: ");
        int X = input.nextInt();

        int remainingCandies = N - X;

        int packets = 0;

        if (remainingCandies > 0) {

            if (remainingCandies % 4 == 0) {
                packets = remainingCandies / 4;
            } else {
                packets = (remainingCandies / 4) + 1;
            }

        }

        System.out.println("Minimum packets needed = " + packets);
    }
}