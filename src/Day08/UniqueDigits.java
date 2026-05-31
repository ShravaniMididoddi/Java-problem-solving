package Day8;
import java.util.Scanner;
//Check Whether All Digits Are Unique
public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] freq = new int[10];
        while(n != 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        boolean unique = true;
        for(int i = 0; i < 10; i++) {
            if(freq[i] > 1) {
                unique = false;
                break;
            }
        }
        if(unique)
            System.out.println("All digits are unique");
        else
            System.out.println("Digits are repeated");
    }
}
