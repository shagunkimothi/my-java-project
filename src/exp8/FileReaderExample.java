package exp8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    // Method that throws FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);  // This line may throw FileNotFoundException

        System.out.println("File content:");
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            System.out.println(line);
        }

        fileReader.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.nextLine();  // Read file name from user

        try {
            readFile(fileName);  // May throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } finally {
            System.out.println("File operation attempted");
        }

        input.close();
    }
}
