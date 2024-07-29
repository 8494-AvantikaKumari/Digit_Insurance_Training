public class Maximum_element_inArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 32, 22};
        System.out.println("maximum element in array is : " + max_Element(arr));


    }


    public static int max_Element(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null");
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}






