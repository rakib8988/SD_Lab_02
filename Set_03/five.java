import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double A = input.nextDouble();

        System.out.print("Enter B: ");
        double B = input.nextDouble();

        System.out.print("Enter C: ");
        double C = input.nextDouble();

        double average = (A + B) / 2;

        if (average > C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}