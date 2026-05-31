package Day6;
import java.util.Scanner;
//leap year or not using loop
public class LeapYearLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        while(true) {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not Leap Year");
            }
            break;
        }
    }
}
