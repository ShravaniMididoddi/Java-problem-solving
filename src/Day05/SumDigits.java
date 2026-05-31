package Day5Assgt;
//Display sum of the digits of a given number
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n != 0) {
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        System.out.println("Sum: " + sum);
    }
}
