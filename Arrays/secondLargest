import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {
            if (arr[j] > l) {
                s = l;
                l = arr[j];
            } else if (arr[j] > s && arr[j] != l) {
                s = arr[j];
            }
        }

        if (s == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + s);
        }

        scan.close();
    }
}
