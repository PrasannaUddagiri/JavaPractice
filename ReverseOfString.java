import java.util.*;
public class ReverseOfString
  {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string: ");
       String inputString = scanner.nextLine();
      String reversedString = reverseString(inputString);
   System.out.println("Reversed string: " + reversedString);
    }
   public static String reverseString(String input)
    {
      StringBuilder reversed = new StringBuilder(input);
      return reversed.reverse().toString();
    }
}






