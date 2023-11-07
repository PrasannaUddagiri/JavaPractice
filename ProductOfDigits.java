import java.util.*;
public class ProductOfDigits
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
          int product = 1;
          while (number > 0) 
          {
           int digit = number % 10; 
           product *= digit; 
            number = number / 10; 
          }
    System.out.println("The product of the digits of " + originalNumber + " is: " + product);
        }
    }
}