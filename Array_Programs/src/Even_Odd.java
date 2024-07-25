import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8};
        int even = 0;
        int odd = 0;
        for(int num:arr){
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);
    }
}
