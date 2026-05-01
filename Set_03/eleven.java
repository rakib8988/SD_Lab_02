import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter pulp in kg: ");
        int N = input.nextInt();

        int totalPages = N * 1000;

        int notebooks = totalPages / 100;

        System.out.println("Number of notebooks = " + notebooks);
    }
}