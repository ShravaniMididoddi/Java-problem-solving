package Day6;
//greatest of three numbers using loop
import java.util.Scanner;
public class GreatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, max = 0;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        int arr[] = {a, b, c};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Greatest number is: " + max);
    }
}
