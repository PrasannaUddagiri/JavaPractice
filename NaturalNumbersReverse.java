import java.util.*;
public class NaturalNumbersReverse
  {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);     
      System.out.print("Enter a positive integer 'n': ");
      int n = sc.nextInt();
      if (n <= 0) {
      System.out.println("Please enter a positive integer.");
     }
      else
      {
       while (n >= 1)
       {
         System.out.println(n);
           n--;
        }
     }
    }
}




