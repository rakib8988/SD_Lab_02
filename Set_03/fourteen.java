import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter profit of Company A: ");
        int P = input.nextInt();

        System.out.print("Enter profit of Company B: ");
        int Q = input.nextInt();

        System.out.print("Enter profit of Company C: ");
        int R = input.nextInt();

        System.out.print("Enter profit of Company D: ");
        int S = input.nextInt();

        if (P > Q + R + S ||
            Q > P + R + S ||
            R > P + Q + S ||
            S > P + Q + R) {

            System.out.println("Monopoly exists");

        } else {

            System.out.println("No monopoly");

        }
    }
}