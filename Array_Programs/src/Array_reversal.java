import java.util.Arrays;

public class Array_reversal {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println("original array:" + Arrays.toString(arr));
        reverse_array(arr);
        System.out.println("reverse array:" + Arrays.toString(arr));
    }

    public static void reverse_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }


    }
}
