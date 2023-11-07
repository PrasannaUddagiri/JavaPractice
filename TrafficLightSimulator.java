import java.util.*;
public class TrafficLightSimulation
  {
    public static void main(String args[]) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the time of day (morning, afternoon, evening): ");
    String timeOfDay = scanner.next();
     System.out.print("Enter the traffic flow (low, medium, high): ");
        String trafficFlow = scanner.next();
        String eastWestLight, northSouthLight;
      if (timeOfDay.equalsIgnoreCase("morning"))
      {
        eastWestLight = "green";
        northSouthLight = "red";
      } 
      else if (timeOfDay.equalsIgnoreCase("afternoon")) 
      {
        if (trafficFlow.equalsIgnoreCase("low"))
        {
          eastWestLight = "green";
          northSouthLight = "red";
        }
        else
        {
          eastWestLight = "yellow";
          northSouthLight = "red";
        }
     }
      else if (timeOfDay.equalsIgnoreCase("evening"))
      {
        if (trafficFlow.equalsIgnoreCase("high"))
        {
           eastWestLight = "red";
           northSouthLight = "green";
       } 
        else
        {
          eastWestLight = "red";
          northSouthLight = "yellow";
       }
    }
      else
      {
        System.out.println("Invalid input for time of day or traffic flow.");
        return;
    }
    System.out.println("East-West Light: " + eastWestLight);
   System.out.println("North-South Light: " + northSouthLight);
  }
}