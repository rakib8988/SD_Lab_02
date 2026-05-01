import java.util.Scanner;

public class six {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int N = input.nextInt();

        System.out.print("Enter subscription cost: ");
        int X = input.nextInt();

        int subscriptions;

        if (N % 6 == 0) {
            subscriptions = N / 6;
        } else {
            subscriptions = (N / 6) + 1;
        }

        int totalCost = subscriptions * X;

        System.out.println("Minimum total cost = " + totalCost);
    }
}