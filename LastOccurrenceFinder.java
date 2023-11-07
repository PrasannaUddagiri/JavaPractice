import java.util.*;
public class LastOccurrenceFinder
  {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter a log file or string: ");
      String inputString = scanner.nextLine();
     System.out.println("Enter the character to find: ");
       char targetChar = scanner.next().charAt(0);
      int lastOccurrenceIndex = 
                 findLastOccurrence(inputString, targetChar);
       if (lastOccurrenceIndex != -1)
       {
        System.out.println("The last occurrence of '" + targetChar + "' is at index: " + lastOccurrenceIndex);
        }
       else
       {
        System.out.println("'" + targetChar + "' was not found in the input string.");
        }
    }
  public static int findLastOccurrence(String input, char target)
    {
      for (int i = input.length() - 1; i >= 0; i--)
        {
           if (input.charAt(i) == target) {
            return i;
        }
      }
        return -1; 
    }
}




