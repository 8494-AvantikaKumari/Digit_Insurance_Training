public class First_occurenece_of_number {
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,2,7};
        int target=2;

        int result=firstOccurence(arr,target);
        System.out.println("first occurence of element "+target+"is in index :"+result);
    }

    public static int firstOccurence(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
