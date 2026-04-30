import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();

        System.out.print("Enter C: ");
        int C = input.nextInt();

        int sum = A + C;

        if (sum % 2 == 0) {

            int B = sum / 2;

            System.out.println("B = " + B);

        } else {

            System.out.println("No integer B exists.");

        }
    }
}