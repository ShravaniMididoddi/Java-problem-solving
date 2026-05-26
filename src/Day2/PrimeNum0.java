package Day2;
//Find prime number or not (loop until n)
import java.util.*;
public class PrimeNum0 {
    public static void main(String[] args) {
        int n,  count=0;
        Scanner sc=new Scanner(System.in);
        System.out . print("Enter a number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++) { //n=7
            if (n % i == 0) {
                count++;
            }
        }
        if( count== 2){
            System.out.println(" The given number " + n + " is Prime");
        }
        else{
            System.out.println("The given number "+n+" is not Prime");
        }
    }
}
