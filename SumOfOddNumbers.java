import java.util.*;
public class SumOfOddNumbers 
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer 'n': ");
      int n = sc.nextInt();
      if (n <= 0)
      {
      System.out.println("Please enter a positive integer.");
      }
      else
      {
          int sum = 0;
          int i = 1; 
          while (i <= n) 
          {
              sum += i;
              i += 2; 
          }

          System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
      }
   }
}
