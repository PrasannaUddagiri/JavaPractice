import java.util.*;
public class SumOfDigits
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a positive integer: ");
      int number = scanner.nextInt();
       if (number <= 0)
       {
     System.out.println("Please enter a positive integer.");
      }
       else
        {
          int originalNumber = number;
          int sum = 0;
         while (number > 0)
      {
         int digit = number % 10; 
          sum += digit;
         number = number / 10; 
      }
    System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);
        }
    }
}