public class InsertionSort {
    // Method to sort an array using Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Main method to test the insertion sort
    public static void main(String args[]) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Unsorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        insertionSort(array);

        System.out.println("\nSorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
