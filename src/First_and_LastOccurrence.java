public class First_and_LastOccurrence {
    public static void main(String[] args){
        int[] arr={1,2,2,2,2,5,6,3};
        int target=2;
        int First=firstOccurrence(arr,target);
        int last=lastOccurrence(arr,target);
        System.out.println(First);
        System.out.println(last);
    }
    
    public static int firstOccurrence(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;  //record the index
                right=mid-1;  //continue searching to the left
            } else if (arr[mid]<target) {
                left=mid+1;
            }else{
                if(arr[mid]>target){
                    right=mid+1;
                }
            }
        }
        return result;
    }
    public static int lastOccurrence(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else{
                if(arr[mid]>target){
                    right=mid+1;
                }
            }
        }
        return result;
    }
}
