package Day5Assgt;
//Display all prime numbers from 1 to 1000
import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for(int n = start; n <= end; n++) {
            boolean prime = true;
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
                System.out.println(n);
            }
        }
    }
}
