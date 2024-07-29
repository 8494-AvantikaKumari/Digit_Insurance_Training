public class Position_of_target_element {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int target = 7;
        int result = binarySearch1(arr, target);
        if (result != -1) {
            System.out.println("element found in index:" + result);
        } else {
            System.out.println("element not found");
        }
    }

    public static int binarySearch1(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left=mid+1;

            }
            else{
                if(arr[mid]>target){
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}