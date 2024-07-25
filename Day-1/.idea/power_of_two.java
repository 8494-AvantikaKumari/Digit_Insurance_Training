import java.sql.SQLOutput;
import java.util.*;
class power_of_two {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("the number should be 0<=N<31 /n enter digit:");
        int N=scn.nextInt();
        if(N>=0 && N<31){
            for (int i = 0; i < N ; i++) {
                System.out.println((int)Math.pow(2,i));

            }



        }else{
            System.out.println("the number should be 0<=N<31");
        }

    }
}
