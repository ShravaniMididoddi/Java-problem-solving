package Day1;
//Print even numbers between 1 to 50( printing)
public class EvenNum0 {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.print(i+" ");
            if(i==50) break;
            i+=2;
        }while(i % 2 == 0);
    }
}
//For Loop
//for(int i=0;i%2==0;i++){
//            System.out.print(i+" ");
//            i++;
//            if(i==51){
//                break;
//            }
//        }

/**Print Reverse with for loop
 *   for(int i=50;i%2==0;i--){
 *             System.out.print(i+" ");
 *             i--;
 *             if(i<1){
 *                 break;
 *             }
 *         }
 */

//Odd numbers logic (i%2!=0)
