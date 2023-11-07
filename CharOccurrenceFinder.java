import java.util.*;
public class CharOccurrenceFinder
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter a paragraph: ");
        String inputString = scanner.nextLine();
   System.out.println("Enter the character to search for: ");
        char targetChar = scanner.next().charAt(0);
   int[] occurrenceIndices = findAllOccurrences(inputString, 
                                          targetChar);
      if (occurrenceIndices.length > 0)
      {
       System.out.println("Occurrences of '" + targetChar + "':");
        for (int index : occurrenceIndices)
          {
          System.out.println("Found at index " + index);
           }
        } 
      else
      {
      System.out.println("'" + targetChar + "' was not found in the input string.");
       }
  }
  public static int[] findAllOccurrences(String input, char target)
    {
      int count = 0;
      for (int i = 0; i < input.length(); i++)
        {
           if (input.charAt(i) == target)
           {
              count++;
            }
        }
          int[] indices = new int[count];
          int index = 0;
          for (int i = 0; i < input.length(); i++) 
          {
            if (input.charAt(i) == target)
            {
              indices[index] = i;
              index++;
            }
        }
        return indices;
    }
} 




