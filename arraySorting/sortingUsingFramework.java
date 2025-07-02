import java.util.Scanner;
import java.util.Arrays;

public class sortingArray {
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

        Arrays.sort(arr);

        System.out.println("Reversed Elements: " + Arrays.toString(arr));
        scan.close();
    }
}
