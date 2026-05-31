package Day4;
//Prime number  loop until n/2(logic)
import java.util.Scanner;
public class PrimeNum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean prime=true;
            if(num<=1){
                prime=false;
            }
            else{
                for(int i=2;i<num/2;i++){
                if (num%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }
}
