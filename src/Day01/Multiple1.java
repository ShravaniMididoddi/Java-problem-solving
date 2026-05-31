package Day1;
//Print all tables from 1 to 10( all tables as output)
public class Multiple1 {
        public static void main(String[] args){
            //num*i=res
            for(int num = 1; num <=10; num++){
                System.out.println();
                System.out.println("Table of "+ num+":");
                for(int i = 1; i <=10; i++){
                    int res = (num*i);
                    System.out.println(num +" * "+ i +" = "+res);
                }
            }
        }
    }
