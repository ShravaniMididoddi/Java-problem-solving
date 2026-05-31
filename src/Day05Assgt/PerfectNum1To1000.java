package Day5Assgt;
//Write a Java program to display all perfect numbers from 1 to 1000.
public class PerfectNum1To1000 {
    public static void main(String[] args) {
        for(int n = 1; n <= 1000; n++) {
            int sum = 0;
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    sum += i;
                }
            }
            if(sum == n) {
                System.out.println(n);
            }
        }
    }
}
