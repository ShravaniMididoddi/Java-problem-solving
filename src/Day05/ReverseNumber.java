package Day5Assgt;
import java.util.Scanner;

//Display reverse of a given number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        System.out.println("Reverse: " + rev);
    }
}
