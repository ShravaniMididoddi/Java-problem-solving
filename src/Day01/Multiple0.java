package Day1;
//Multiple table of a number
import java.util.Scanner;
public class Multiple0 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int num;
            System.out.println("Enter number: ");
            num=sc.nextInt();

            //loop for multiplication
            for(int i=1; i<=10; i++){
                int result = num*i;
                System.out.println(num+" * "+i+" = "+ result) ;
            }
        }
    }
