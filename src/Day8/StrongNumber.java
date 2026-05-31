package Day8;
/*
Strong Number or Not
Example:
145
1! + 4! + 5! = 145
 */
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n != 0) {
            int last = n % 10;
            int fact = 1;
            for(int i = 1; i <= last; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if(sum == temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
