import java.util.*;
public class SumOfNaturalNumbers
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
     System.out.print("Enter a positive integer 'n': ");
      int n = scanner.nextInt();
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
            i++;
         }
   System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
        }
   }
}



