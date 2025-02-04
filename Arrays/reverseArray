import java.util.Scanner;
import java.util.Arrays;  // Required for Arrays.toString()

public class reverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        // Reverse array logic
        int[] rev = new int[n];
        for (int k = n - 1, j = 0; k >= 0; k--, j++) {
            rev[j] = arr[k];
        }

        // Print reversed array
        System.out.println("Reversed Elements: " + Arrays.toString(rev));

        scan.close();
    }
}
