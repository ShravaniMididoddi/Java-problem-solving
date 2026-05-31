package Day8;
import java.util.Scanner;
//Find Second Smallest Digit
public class SecondSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int smallest = 10;
        int secondSmallest = 10;
        while(n != 0) {
            int digit = n % 10;
            if(digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if(digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
            n /= 10;
        }
        System.out.println("Second Smallest Digit = " + secondSmallest);
    }
}
