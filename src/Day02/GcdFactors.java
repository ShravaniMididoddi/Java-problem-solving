package Day2;
//find gcd of two numbers using factors method
import java.util.Scanner;
public class GcdFactors {
    public static void main(String[] args) {
        int a,b;
        int gcd = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        int min;
        min=a<b?a:b;//ternary operator
        for(int i=1;i<=min;i++){
            if(min%a==0&&min%b==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is "+gcd);
    }
}
