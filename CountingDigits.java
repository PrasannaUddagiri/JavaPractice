import java.util.*;
public class CountingDigits
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
     System.out.print("Enter a positive integer: ");
      int number = scanner.nextInt();
      if (number <= 0) 
      {
     System.out.println("Please enter a positive integer.");
        } else {
            int count = 0;
            int temp = number; // Make a copy of the input number

            while (temp > 0) {
                temp = temp / 10; // Remove the last digit
                count++;
            }

            System.out.println("Number of digits in " + number + " is: " + count);
        }

        
    }
}
