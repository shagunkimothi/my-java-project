package exp8;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentDataReader {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("student.txt");

            int character;
            System.out.println("Student Data from file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);  // Print each character
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file student.txt was not found.");
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        }
    }
}
