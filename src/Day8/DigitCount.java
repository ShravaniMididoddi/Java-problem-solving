package Day8;
import java.util.Scanner;
/*
Count Repeated Digits
Input: 122333
Output:
1 -> 1 time
2 -> 2 times
3 -> 3 times
 */
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        int[] freq = new int[10];
        while(n != 0) {
            int digit = (int)(n % 10);
            freq[digit]++;
            n /= 10;
        }
        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0) {
                System.out.println(i + " -> " + freq[i] + " time(s)");
            }
        }
    }
}
