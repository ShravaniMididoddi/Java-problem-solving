package Day1;
//Sum of first 10 natural numbers.
public class Sum0 {
    public static void main(String[] args){
        int sum = 0 ,i=1; //sum+i=sum
        while(i<=10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum:"+ sum);
    }
}
