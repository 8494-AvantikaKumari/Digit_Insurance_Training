
    public class SmallestElement {
        public static int smallestGE(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] >= target) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5, 6, 8, 9};
            int target = 4;
            int index = smallestGE(arr, target);
            if (index != -1) {
                System.out.println("Smallest element greater than or equal to " + target + " is " + arr[index] + " at index: " + index);
            } else {
                System.out.println("No element greater than or equal to " + target);
            }
        }
    }

