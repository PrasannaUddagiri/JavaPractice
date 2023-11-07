import java.util.*;
public class SumOfFirstAndLastDigit
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
         int firstDigit = 0;
        int lastDigit = number % 10; 
         int temp = number; 
          while (temp > 0)
         {
          firstDigit = temp % 10; 
            temp = temp / 10;
         }
        int sum = firstDigit + lastDigit;      System.out.println("The sum of the first and last digits of " + number + " is: " + sum);
        }
    }
}