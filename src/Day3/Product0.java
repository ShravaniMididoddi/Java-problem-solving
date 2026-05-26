package Day3;
//Product of digits in a number
import java.util.Scanner;
public class Product0 {
    public static void main(String[] args) {
        int n,digit,product=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=in.nextInt();
        while(n!=0){
            digit=n%10;
            product=product*digit;
            n=n/10;
        }
        System.out.println("The product of the given number is: "+product);
    }
}
