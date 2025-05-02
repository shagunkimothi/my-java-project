package exp9;

import java.util.ArrayList;
import java.util.HashSet;

public class SumOfUniqueValues {
    public static void main(String[] args) {
        // Step 1: Create ArrayList with duplicates
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        // Step 2: Convert to HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Step 3: Calculate the sum of unique values
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        // Step 4: Display result
        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum of unique values: " + sum);
    }
}
