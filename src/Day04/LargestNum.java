package Day4;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        int n, max = 0,last;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(n!=0){
            last=n%10;
                if(max<last) {
                    max = last;
                }
                n=n/10;
        }
        System.out.println("The largest number is: "+max);
    }
}
