package Patterns;
import java.util.Scanner;
public class numberTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(i);
                }
                System.out.println();
        }
    }
}

