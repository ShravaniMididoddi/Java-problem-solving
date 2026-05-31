package Day3;
//Reverse a number
import java.util.*;
public class Reverse0 {
    public static void main(String[] args){
        int n,last,rev=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=in.nextInt();
        while(n!=0){
            last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        System.out.println("The last number is "+rev);
    }
}
