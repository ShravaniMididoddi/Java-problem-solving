package Day5Assgt;
//Write a Java program to display sum of the factors of a given number.
import java.util.Scanner;
public class SumFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of factors: " + sum);
    }
}
