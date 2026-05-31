package Day5Assgt;
//Display digits of a given number
import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n != 0) {
            int last = n % 10;
            System.out.println(last);
            n = n / 10;
        }
    }
}
