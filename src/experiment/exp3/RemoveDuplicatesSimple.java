package experiment.exp3;
import java.util.Arrays;

public class RemoveDuplicatesSimple {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n; // If array has 0 or 1 element, no duplicates possible
        }

        int j = 0; // Index for unique elements
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[j++] = arr[i]; // Store unique element
            }
        }
        return j; // New size of array
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 8, 1, 8, 3}; // Example input
        int newSize = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newSize)));
    }
}
