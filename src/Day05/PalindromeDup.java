package Day5Assgt;
import java.util.Scanner;

//Check whether given number is palindrome or not?
public class PalindromeDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        while(n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        if(temp == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}