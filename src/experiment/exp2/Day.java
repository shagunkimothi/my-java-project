package experiment.exp2;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number (1–7)
        System.out.print("Enter a number (1–7): ");
        int dayNumber = sc.nextInt();

        // Use a switch statement to determine the day of the week
        String day;
        switch ( dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day number";
                break;
        }

        // Print the day of the week
        System.out.println("The day of the week is: " + day);

        // Close the scanner
        sc.close();
    }
}