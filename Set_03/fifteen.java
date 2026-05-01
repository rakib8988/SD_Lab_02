import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();

        System.out.print("Enter B: ");
        int B = input.nextInt();

        System.out.print("Enter C: ");
        int C = input.nextInt();

        int minimumRequired = Math.max(A, C);

        if (minimumRequired <= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}