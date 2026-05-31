package Day1;
//Count even numbers between 1 to 50( only count)
public class CountNumbers {
        public static void main(String[] args) {
            //count even numbers
            int count = 0;
            for (int j = 1; j <= 50; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            System.out.print("------>Count: " + count);
        }
    }

/** Count odd numbers
 * int count=0;
 *         for(int j=1;j<=50;j++){
 *             if(j%2!=0){
 *                 System.out.print(j+" ");
 *                 count++;
 *             }
 *         }System.out.print("------>Count: "+count);
 */
