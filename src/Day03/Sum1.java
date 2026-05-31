package Day3;
//Sum of digits in a number
import java.util.Scanner;
public class Sum1 {
    public static void main(String[] args) {
        int n,digit,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        while(n!=0){
            digit=n%10; //n= 1234; 1234%10 = 123
            sum=sum+digit;//sum=0+123
            n=n/10; //removes the last digit
        }
        System.out.println("The sum is: "+sum);
    }
}