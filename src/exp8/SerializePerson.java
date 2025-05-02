package exp8;
import java.io.*;

// Person class implementing Serializable
class Person implements Serializable {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializePerson {

    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Aman", 21);

        // Serialize the object
        try {
            FileOutputStream fileOut = new FileOutputStream("person.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(person1);

            out.close();
            fileOut.close();
            System.out.println("Person object serialized to person.txt");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize the object
        try {
            FileInputStream fileIn = new FileInputStream("person.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Person deserializedPerson = (Person) in.readObject();

            in.close();
            fileIn.close();

            // Confirm the values
            System.out.println("Deserialized Person:");
            System.out.println("Name: " + deserializedPerson.name);
            System.out.println("Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
