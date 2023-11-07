import java.util.*;
public class CurrencyConverter
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount in the source currency: ");
double amount=sc.nextDouble();
System.out.println("Enter the exchange rate from source to target currency: ");
double exchangeRate=sc.nextDouble();
double convertedAmount=amount*exchangeRate;
System.out.println("The converted amount in the target currency is: " +convertedAmount);
}
}