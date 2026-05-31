package Day9;
import java.util.Scanner;
//Find Middle Digit(s) of a Number
public class MiddleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        int len = num.length();
        if(len % 2 == 1) {
            System.out.println("Middle digit = "
                    + num.charAt(len / 2));
        }
        else {
            System.out.println("Middle digits = "
                    + num.charAt(len / 2 - 1)
                    + " and "
                    + num.charAt(len / 2));
        }
    }
}
