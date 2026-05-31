package Day2;
//find factorial of a number
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int n;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("Factorial of the given number is :");
        System.out.println(fact);
    }
}
