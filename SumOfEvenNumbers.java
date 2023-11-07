import java.util.*;
public class SumOfEvenNumbers
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
       int i = 2; 
      while (i <= n)
        {
          sum += i;
         i += 2; 
       }
     System.out.println("The sum of even numbers from 2 to " + n + " is: " + sum);
        }
    }
}





