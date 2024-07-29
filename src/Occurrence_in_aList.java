import java.util.ArrayList;

public class Occurrence_in_aList {
    public static void main(String[] args){
        int[] arr={2,3,4,5,2,3,4,2};
        int target=2;
        ArrayList<Integer> occurrence=find(arr,target);
        System.out.println(occurrence);
    }

    public static ArrayList<Integer> find(int[] arr,int target){
        ArrayList<Integer> indices=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                indices.add(i);
            }
        }
        return indices;
    }
}
