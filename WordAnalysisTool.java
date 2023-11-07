import java.util.*;
public class WordAnalysisTool
  {
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String sentence = scanner.nextLine().toLowerCase(); 
      int vowelCount = 0;
      int consonantCount = 0;
      for (int i = 0; i < sentence.length(); i++)
        {
          char character = sentence.charAt(i);
          if (Character.isLetter(character))
       {
         if ("aeiou".contains(String.valueOf(character)))
         {
            vowelCount++;
         } 
         else
         {
           consonantCount++;
         }
       }
    }
       System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
   }
}