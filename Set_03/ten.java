import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter B1: ");
        int B1 = input.nextInt();

        System.out.print("Enter B2: ");
        int B2 = input.nextInt();

        System.out.print("Enter B3: ");
        int B3 = input.nextInt();

        int emptyCount = 0;

        if (B1 == 0) {
            emptyCount++;
        }

        if (B2 == 0) {
            emptyCount++;
        }

        if (B3 == 0) {
            emptyCount++;
        }

        if (emptyCount >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
    }
}