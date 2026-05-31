package Day5Assgt;
//Check whether given number is prime number or not
public class Prime1To1000 {
    public static void main(String[] args) {
        for(int n = 2; n <= 1000; n++) {
            boolean prime = true;
            for(int i = 2; i <= n / 2; i++) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.println(n);
            }
        }
    }
}
