import java.util.*;
public class Sum_Avg {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int size=scn.nextInt();

        int[] arr=new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=scn.nextInt();
        }

        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=arr[i];
        }
        double avg=(double)sum/size;
        System.out.println("sum:"+sum);
        System.out.println("average:"+avg);
    }
}

