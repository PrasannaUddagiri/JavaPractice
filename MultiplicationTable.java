import java.util.*;
public class MultiplicationTable
  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
       System.out.print("Enter a positive integer 'n' for the multiplication table: ");
        int n = scanner.nextInt();
        if (n <= 0)
        {
      System.out.println("Please enter a positive integer.");
        }
        else
        {
          int i = 1;
   System.out.println("Multiplication table for " + n + ":");
         while (i <= 10)
           {
            int result = n * i;
         System.out.println(n + " x " + i + " = " + result);
                i++;
            }
        }
     }
  }





