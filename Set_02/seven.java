import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < 5 - 1; i++) {

            for (int j = 0; j < 5 - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        System.out.println("Array in ascending order:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}