import java.util.*;
import java.util.Random;
 class Flip_coin {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("enter the number of times you want to toss the coin");
         int coin_tossed = scn.nextInt();
         if (coin_tossed <= 0) {
             System.out.println("please enter a positive");
             return;
         }

             Random random = new Random();
             int heads = 0;
             int tails = 0;
             for (int i = 0; i < coin_tossed; i++) {
                 if (random.nextDouble() < 0.5) {
                    tails++;
                 } else {
                     heads++;
                 }
             }
             double heads_count_percentage = (double) heads / coin_tossed * 100;
             double tails_count_percentage = (double) tails / coin_tossed * 100;

             System.out.println(heads_count_percentage);
             System.out.println(tails_count_percentage);


         }


     }

