import java.util.Scanner;

public class eight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of sections: ");
        int X = input.nextInt();

        System.out.print("Enter students per section: ");
        int Y = input.nextInt();

        System.out.print("Enter passed students: ");
        int Z = input.nextInt();

        int totalStudents = X * Y;

        if (Z > totalStudents / 2.0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}