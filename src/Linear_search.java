public class Linear_search {
    public static void main(String[] args){
        int[] arr={2,3,1,5,4,6};
        int target=5;
       int result=(linear_search1(arr,target)) ;

       if(result!=-1){
           System.out.println("element is found in index:"+result);

       }else{
           System.out.println("element is not found");
       }

    }
    public static int linear_search1(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
