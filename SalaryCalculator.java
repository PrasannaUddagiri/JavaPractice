import java.util.*;
public class SalaryCalculator
  {
    public static void main(String args[]) 
  {
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter the employee's monthly salary: ");
   double monthlySalary = scanner.nextDouble();
   double annualSalary = monthlySalary * 12;
    double tax = 0.0;
    if (annualSalary <= 50000)
    {
    tax = annualSalary * 0.05; 
     } 
    else if (annualSalary <= 100000)
    {
     tax = annualSalary * 0.10; 
     }
    else
    {
      tax = annualSalary * 0.15; 
    }
     double netSalary = annualSalary - tax;
   System.out.println("Annual Salary: $" + annualSalary);
     System.out.println("Tax: $" + tax);
     System.out.println("Net Salary: $" + netSalary);
   }
}
