import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (pm): ");
        int X = input.nextInt();

        int finishTime = X + 3;

        if (finishTime <= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}