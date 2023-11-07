import java.util.*;
public class LogicalOperations
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first boolean value (true or false): ");
boolean bool1=sc.nextBoolean();
System.out.println("Enter the second boolean value (true or false): ");
boolean bool2=sc.nextBoolean();        
boolean andResult = bool1 && bool2; 
boolean orResult = bool1 || bool2;  
boolean notResult1 = !bool1;        
boolean notResult2 = !bool2;        
System.out.println("Logical AND result: " + andResult);
System.out.println("Logical OR result: " + orResult);
System.out.println("Logical NOT result for the first value: " + notResult1);
System.out.println("Logical NOT result for the second value: " + notResult2);
}
}
