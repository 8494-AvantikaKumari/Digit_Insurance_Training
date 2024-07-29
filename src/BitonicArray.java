public class BitonicArray {
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is peak
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            // If the middle element is part of the increasing subarray, move to the right subarray
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else { // If the middle element is part of the decreasing subarray, move to the left subarray
                left = mid + 1;
            }
        }

        return -1; // Should not reach here for a valid bitonic array
    }

    public static void main(String[] args) {
        int[] bitonicArray = {1, 3, 8, 12, 4, 2};
        int peakIndex = findPeak(bitonicArray);
        System.out.println("The peak element is at index: " + peakIndex);
    }
}
