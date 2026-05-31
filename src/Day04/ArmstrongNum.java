package Day4;
//Armstrong number or not
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        int n, temp, last, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while(n != 0) {
            last = n % 10;
            sum = sum + (last * last * last);
            n = n / 10;
        }
        if(temp == sum) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}