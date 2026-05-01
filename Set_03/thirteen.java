import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter topic A: ");
        int A = input.nextInt();

        System.out.print("Enter topic B: ");
        int B = input.nextInt();

        System.out.print("Enter topic C: ");
        int C = input.nextInt();

        System.out.print("Enter selected topic X: ");
        int X = input.nextInt();

        if (X == A || X == B || X == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}