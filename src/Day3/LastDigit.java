package Day3;
//Find the last digit of a number
import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,digit;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        while(n!=0) {
            digit = n % 10;
            System.out.println("The last digit of the given number is: " + digit);
            break;
        }
    }
}
