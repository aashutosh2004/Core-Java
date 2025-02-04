import java.util.Scanner;

public class largestArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element: "+max);
        scan.close();
    }
}
