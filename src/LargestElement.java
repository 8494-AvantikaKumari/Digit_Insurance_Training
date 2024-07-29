
    public class LargestElement {
        public static int largestLE(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] <= target) {
                    result = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5, 6, 8, 9};
            int target = 7;
            int index = largestLE(arr, target);
            if (index != -1) {
                System.out.println("Largest element smaller than or equal to " + target + " is " + arr[index] + " at index: " + index);
            } else {
                System.out.println("No element smaller than or equal to " + target);
            }
        }
    }

