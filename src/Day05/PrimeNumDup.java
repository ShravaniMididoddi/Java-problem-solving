package Day5Assgt;
//Check whether given number is prime number or not?
import java.util.Scanner;
public class PrimeNumDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n <= 1) {
            prime = false;
        }
        else {
            for(int i = 2; i <= n / 2; i++) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if(prime) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}
