package experiment.exp3;
import java.util.Scanner;

public class Palindrome {
   public Palindrome() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String var2 = var1.nextLine();
      var1.close();
      String var3 = (new StringBuilder(var2)).reverse().toString();
      if (var2.equals(var3)) {
         System.out.println("Palindrome");
      } else {
         System.out.println("Not a Palindrome");
      }

   }
};

