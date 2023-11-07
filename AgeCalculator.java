import java.util.*;
public class AgeCalculator
  {
    public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter your birthdate (YYYY-MM-DD): ");
   String birthdateStr = scanner.next();
   String[] parts = birthdateStr.split("-");
   int year = Integer.parseInt(parts[0]);
   int month = Integer.parseInt(parts[1]);
   int day = Integer.parseInt(parts[2]);
   Calendar birthdate = Calendar.getInstance();
   birthdate.set(year, month - 1, day); 
   Calendar currentDate = Calendar.getInstance();
   int age = currentDate.get(Calendar.YEAR) - 
              birthdate.get(Calendar.YEAR);
    if (currentDate.get(Calendar.MONTH) < 
          birthdate.get(Calendar.MONTH)
          || (currentDate.get(Calendar.MONTH) == 
           birthdate.get(Calendar.MONTH)
          && currentDate.get(Calendar.DAY_OF_MONTH) < 
         birthdate.get(Calendar.DAY_OF_MONTH)))
    {
            age--;
        }
       if (age < 18)
       {
            System.out.println("You are a minor.");
        } else
       {
            System.out.println("You are an adult.");
        }
   }
}





