import java.util.Scanner;

public class six {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int search = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 5; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }

        }

        if (found) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }
}