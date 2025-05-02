package experiment.exp3;
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 32, 22, 54, 39, 53, 19};
        int secondLargest = findSecondLargest(arr);

        if (secondLargest != -1) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("Second largest element does not exist.");
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // If array has less than 2 elements, second largest doesn't exist
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        // If secondLargest is still MIN_VALUE, it means there is no second largest element
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}

