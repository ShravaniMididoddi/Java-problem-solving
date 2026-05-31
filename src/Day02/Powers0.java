package Day2;
//Find power of a number using (math.pow ())
import java.util.*;
public class Powers0 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int base,power;
        double res;
        System.out.print("Enter Base number :");
        base= sc.nextInt();
        System.out.print("Enter Power :");
        power = sc.nextInt();
        res=Math.pow(base,power);
        System.out.println("Result: "+res);
    }
}
