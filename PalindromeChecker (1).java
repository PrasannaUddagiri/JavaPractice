import java.util.*;
public class PalindromeChecker
  {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a word: ");
     String inputString = scanner.nextLine().toLowerCase(); 
      if (isPalindrome(inputString))
      {
       System.out.println("The word is a palindrome.");
      }
      else
      {
        System.out.println("The word is not a palindrome.");
      }
    }
   public static boolean isPalindrome(String input)
   {
  String cleanString = input.replaceAll("[^a-zA-Z0-9]", "")    String reversedString = new 
            StringBuilder(cleanString).reverse().toString();
   return cleanString.equals(reversedString);
    }
}