import java.util.Scanner;

public class four {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a == b) {
            System.out.println("Unique value = " + c);
        }
        else if (a == c) {
            System.out.println("Unique value = " + b);
        }
        else {
            System.out.println("Unique value = " + a);
        }
    }
}