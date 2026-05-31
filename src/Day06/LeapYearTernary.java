package Day6;
import java.util.Scanner;
//leap year or not using ternary operation
public class LeapYearTernary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    ? "Leap Year"
                    : "Not Leap Year";
            System.out.println(result);
        }
}
