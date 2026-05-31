package Day3;
//Adding to  to reverse question find the digits are palindrome or not using reverse
import java.util.Scanner;
public class PalindromeReverse {
    public static void main(String[] args) {
        int n, temp, last, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp =n;
        while(n!=0){
            last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("The given number is Palindrome");
        }
        else{
            System.out.println("The given number is not Palindrome");
        }
    }
}
