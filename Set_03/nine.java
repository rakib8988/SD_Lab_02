import java.util.Scanner;

public class nine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter daily working hours (X): ");
        int X = input.nextInt();

        System.out.print("Enter Chill Day working hours (Y): ");
        int Y = input.nextInt();

        int totalHours = (4 * X) + Y;

        System.out.println("Total working hours = " + totalHours);
    }
}