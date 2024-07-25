import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class positive_negative {
    public static void main(String[] args) {
        int[] arr = {2, -1, 3, 4, -5};
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();

        for (int num:arr){
            if(num>=0){
                positive.add(num);
            }else{
                negative.add(num);
            }
        }

        //convert arraylist to array

        int[] positive_array=positive.stream().mapToInt(i->i).toArray();
        int[] negative_array=negative.stream().mapToInt(i->i).toArray();

        System.out.println("positive integers:"+Arrays.toString(positive_array));
        System.out.println("negative integers:"+Arrays.toString(negative_array));

    }

}
