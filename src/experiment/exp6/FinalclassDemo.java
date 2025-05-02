package experiment.exp6;

// Final class - Cannot be extended
final class Logger {
    // Method to log a message
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// Attempting to extend Logger (Will cause a compilation error)
/*
class ExtendedLogger extends Logger {
    void logMessage(String message) {
        System.out.println("Extended Log: " + message);
    }
}
*/

public class FinalclassDemo {
    public static void main(String[] args) {
        // Create an object of the Logger class
        Logger logger = new Logger();

        // Call logMessage() method
        logger.logMessage("This is a sample log message.");

        // Uncommenting the below class definition will cause a compilation error
        // ExtendedLogger extendedLogger = new ExtendedLogger();  
    }
}

