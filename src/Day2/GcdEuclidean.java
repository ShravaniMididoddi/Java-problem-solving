package Day2;
//Find gcd of two numbers using euclidean algorithm
import java.util.Scanner;
public class GcdEuclidean {
    public static void main(String[] args){
        int a,b,temp;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=in.nextInt();
        System.out.print("Enter second number: ");
        b=in.nextInt();
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD is: "+a);
    }
}
