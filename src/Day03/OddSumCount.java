package Day3;
//Find sum of odd digits in a number and count them
import java.util.Scanner;
public class OddSumCount {
    public static void main(String[] args){
        int a,last,sum=0,count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");//134578---->1357
        a=input.nextInt();
        while(a!=0){
            last=a%10;
            if(last%2!=0){
                sum+=last;
                count++;
            }
            a=a/10;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The count is: "+count);
    }
}
