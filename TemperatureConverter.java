import java.util.*;
public class TemperatureConverter
  {
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the temperature value: ");
     double temperature = scanner.nextDouble();
     System.out.println("Enter the unit (C for Celsius, F for  Fahrenheit): ");
     char unit = sc.next().charAt(0);
     double convertedTemperature;
      char targetUnit;
      if (unit == 'C' || unit == 'c') 
        {
        convertedTemperature = (temperature * 9/5) + 32;
           targetUnit = 'F';
        }
        else if (unit == 'F' || unit == 'f')
        {
         convertedTemperature = (temperature - 32) * 5/9;
            targetUnit = 'C';
        } 
        else
        {
            System.out.println("Invalid unit. Please enter C for Celsius or F for Fahrenheit.");
            return;
        }
      System.out.println("Converted temperature: " + convertedTemperature + " " + targetUnit);
    }
}