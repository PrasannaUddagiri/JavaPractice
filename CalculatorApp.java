import java.util.*;
public class CalculatorApp
  {
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first value: ");
    double value1 = scanner.nextDouble();
   System.out.print("Enter the operator (+, -, *, /): ");
   char operator = scanner.next().charAt(0);
    System.out.print("Enter the second value: ");      
     double value2 = scanner.nextDouble();
     double result;
    switch (operator)
      {
         case '+':
           result = value1 + value2;
         break;
         case '-':
            result = value1 - value2;
         break;
         case '*':
            result = value1 * value2;
         break;
          case '/':
         if (value2 != 0)
         {
         result = value1 / value2;
         } 
         else
         {
     System.out.println("Division by zero is not allowed.");
           return;
         }
          break;
           default:
           System.out.println("Invalid operator. Please enter +, -, *, or /.");
             return;
        }
  System.out.println("Result: " + result);
   }
}