package Day8;
import java.util.Scanner;
//Find Second Largest Digit
public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int largest = -1;
        int secondLargest = -1;
        while(n != 0) {
            int digit = n % 10;
            if(digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if(digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
            n /= 10;
        }
        System.out.println("Second Largest Digit = " + secondLargest);
    }
}
