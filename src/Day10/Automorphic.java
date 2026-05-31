package Day10;
import java.util.Scanner;
//Automorphic Number or Not
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int digits = 0;
        while(temp != 0) {
            digits++;
            temp /= 10;
        }
        int divisor = 1;
        for(int i = 1; i <= digits; i++) {
            divisor *= 10;
        }
        if(square % divisor == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
