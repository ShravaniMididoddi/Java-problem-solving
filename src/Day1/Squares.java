package Day1;
//Print square numbers
import java.util.*;
public class Squares {
    public static void main(String[] args) {
        //i*i=res
        /**n=5
         *for---> i=1;1<=5(true)
         * i------>1
         * res = 1*1 =1
         * i++---->2(loop continues till n)
         * for---> i=2;2<=5(true)
         * res = 2*2 = 4.....prints the res till it reaches the condition 5<=5
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();//n is the limit decided by the input of a user
        for(int i=1;i<=n;i++){
            int res= i*i;
            System.out.println(res);
        }
    }
}
