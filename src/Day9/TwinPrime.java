package Day9;
import java.util.Scanner;
//Twin Prime Numbers
public class TwinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        boolean prime1 = true;
        boolean prime2 = true;
        for(int i = 2; i <= a / 2; i++) {
            if(a % i == 0) {
                prime1 = false;
                break;
            }
        }
        for(int i = 2; i <= b / 2; i++) {
            if(b % i == 0) {
                prime2 = false;
                break;
            }
        }
        if(prime1 && prime2 && Math.abs(a - b) == 2) {
            System.out.println("Twin Prime Numbers");
        }
        else {
            System.out.println("Not Twin Prime Numbers");
        }
    }
}
