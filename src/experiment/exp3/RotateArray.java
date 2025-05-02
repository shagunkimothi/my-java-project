package experiment.exp3;

import java.util.Arrays;

public class RotateArray {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where K > n

        reverse(arr, 0, n - 1);     // Step 1: Reverse the entire array
        reverse(arr, 0, k - 1);     // Step 2: Reverse first K elements
        reverse(arr, k, n - 1);     // Step 3: Reverse remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int k = 2; // Number of positions to rotate

        rotateRight(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}

