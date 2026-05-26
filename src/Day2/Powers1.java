package Day2;
//find power of number using loop
import java.util.Scanner;
public class Powers1 {
    public static void main(String[] args) {
        int base,power;
        double result=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number :");
        base=sc.nextInt();
        System.out.print("Enter the power number :");
        power=sc.nextInt();
        //loop
        for(int i=1;i<=power;i++){
            result*=base;
        }
        System.out.println("Base "+base+" to the power of "+power+" is = "+result);
    }
}
