import java.util.*;
public class FirstOccurrenceFinder
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a paragraph: ");
      String inputString = scanner.nextLine();
     System.out.println("Enter the character to find: ");
       char targetChar = scanner.next().charAt(0);
      int firstOccurrenceIndex = 
              findFirstOccurrence(inputString, targetChar);
       if (firstOccurrenceIndex != -1)
       {
         System.out.println("The first occurrence of '" + targetChar + "' is at index: " + firstOccurrenceIndex);
       }
       else 
       {
         System.out.println("'" + targetChar + "' was not found in the input string.");
       }
    }
 public static int findFirstOccurrence(String input, char 
          target)
    {
       for (int i = 0; i < input.length(); i++) 
       {
         if (input.charAt(i) == target) {
            return i;
       }
     }
        return -1; 
    }
}
