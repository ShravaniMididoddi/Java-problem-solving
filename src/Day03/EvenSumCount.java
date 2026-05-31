package Day3;
//Find sum of even digits in a number and count also
import java.util.Scanner;
public class EvenSumCount {
    public static void main(String [] args){
        int n,last,sum=0,count=0; //1234
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(n!=0){
            last=n%10;
            if (last % 2 == 0) {
                sum += last;
                count++;
            }
            n=n/10;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The count is: "+count);
    }
}
