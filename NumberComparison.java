import java.util.*;
public class NumberComparison 
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
double num1 = scanner.nextDouble();
System.out.println("Enter the second number: ");
double num2 = scanner.nextDouble();
boolean isEqual=num1== num2;
boolean isGreaterThan=num1>num2;
boolean isLessThan = num1<num2;
boolean isGreaterOrEqual=num1>=num2;
boolean isLessOrEqual=num1<=num2;
System.out.println("Are the numbers equal? " + isEqual);
System.out.println("Is the first number greater than the second number? " + isGreaterThan);
System.out.println("Is the first number less than the second number? " + isLessThan);
System.out.println("Is the first number greater than or equal to the second number? " + isGreaterOrEqual);
System.out.println("Is the first number less than or equal to the second number? " + isLessOrEqual);
}