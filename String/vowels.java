package String;
import java.util.*;

public class vowels {
    public static void main(String[] args) {
        char[] arr = new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int n= sc.nextInt();
        System.out.println("Enter 10 characters:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Consonants are:");
        for(int i = 0; i < arr.length; i++) {
            char ch = Character.toLowerCase(arr[i]);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
