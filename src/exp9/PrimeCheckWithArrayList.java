package exp9;
import java.util.ArrayList;

public class PrimeCheckWithArrayList {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Storing integers using autoboxing
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);   // autoboxing: int -> Integer
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(11);
        numbers.add(15);
        numbers.add(17);

        // Iterating and checking for prime numbers
        for (Integer number : numbers) {
            int n = number;  // unboxing: Integer -> int (automatically)
            if (isPrime(n)) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is NOT a Prime Number");
            }
        }
    }
}
