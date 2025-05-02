package exp8;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCharacterCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();

        int wordCount = 0;
        int charCount = 0;

        try {
            FileReader reader = new FileReader(fileName);
            Scanner fileScanner = new Scanner(reader);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters excluding whitespace
                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);

            fileScanner.close();
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        }

        input.close();
    }
}

