package Day3;
//Find the first digit of a number
import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n=input.nextInt();
        while(n>=10){
            n= n/10;
        }
        System.out.println("The first digit of the given number is: "+n);
    }
}
