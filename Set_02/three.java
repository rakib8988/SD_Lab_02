import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < 5; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }

        System.out.println("Smallest number = " + smallest);
    }
}