package exp9;

import java.util.HashSet;

public class UniqueNamesSet {
    public static void main(String[] args) {
        // Step 1: Create an array of names with duplicates
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        // Step 2: Store them in a HashSet to remove duplicates
        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        // Step 3: Check if a specific name exists
        String searchName = "Sourabh";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " is present in the set.");
        } else {
            System.out.println(searchName + " is NOT present in the set.");
        }

        // Step 4: Print all unique names
        System.out.println("\nUnique Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
