import java.util.*;
public class PasswordStrengthChecker
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a password: ");
       String password = sc.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;
       for (int i = 0; i < password.length(); i++)
         {
           char character = password.charAt(i);
           if (Character.isLetter(character))
           {
              alphabetCount++;
            }
           else if (Character.isDigit(character))
           {
             digitCount++;
            }
           else
           {
            specialCharacterCount++;
            }
        }
        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharacterCount);
   }
}