import java.util.*;
public class FrequencyOfDigits
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
       int[] digitFrequency = new int[10];
        while (number > 0)
          {
           int digit = number % 10; 
            digitFrequency[digit]++; 
           number = number / 10; 
          }
    System.out.println("Digit frequencies in " + originalNumber + ":");
        for (int i = 0; i <= 9; i++)
        {
          if (digitFrequency[i] > 0)
          {
       System.out.println("Digit " + i + ": " + digitFrequency[i] + " times");
          }
        }
      }
    }
}