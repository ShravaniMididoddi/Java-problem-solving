package Day4;
import java.util.*;
public class SmallestNum {
    public static void main(String args[]){
        int n,min=9,last;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        while(n!=0){
            last=n%10;
            if(last<min){
                min=last;
            }
            n=n/10;
        }
        System.out.println("The smallest number is: "+min);
    }
}
