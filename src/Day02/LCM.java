package Day2;
//find LCM of two numbers
import java.util.Scanner;
public class LCM {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,max; //a=number b=number max differs the largest from a&b
    System.out.print("Enter the first number: ");
    a=sc.nextInt();
    System.out.print("Enter the second number: ");
    b=sc.nextInt();
    max=a>b?a:b;//condition ? value_if_true : value_if_false
    while (true) {
        if(max%a==0 && max%b==0){
            System.out.println("LCM : "+max);
            break;
        }
        max++;
    }
}
}
