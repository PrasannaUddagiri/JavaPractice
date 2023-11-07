import java.util.*;
public class RockPaperScissors
  {
    public static void main(String args[]) 
    {
     String[] choices = {"Rock", "Paper", "Scissors"};
     Random random = new Random();
     Scanner sc = new Scanner(System.in);
     while (true) {
     int computerChoiceIndex = random.nextInt(3);
     String computerChoice = choices[computerChoiceIndex];
     System.out.print("Enter your choice (Rock, Paper, Scissors): ");
     String userChoice = scanner.next();
     if (!userChoice.equals("Rock") 
         &&!userChoice.equals("Paper") && 
          !userChoice.equals("Scissors"))
     {
       System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            continue;
     }
     System.out.println("Your choice: " + userChoice);
     System.out.println("Computer's choice: " + computerChoice);
  if (userChoice.equals(computerChoice))
  {
     System.out.println("It's a tie!");
   } 
  else if ((userChoice.equals("Rock") && 
        computerChoice.equals("Scissors"))
        || (userChoice.equals("Paper") && 
         computerChoice.equals("Rock"))
        || (userChoice.equals("Scissors") && 
          computerChoice.equals("Paper")))
  {
     System.out.println("You win this round!");
  } else
  {
     System.out.println("Computer wins this round!");
  }
     System.out.print("Play again? (yes/no): ");
     String playAgain = scanner.next().toLowerCase();
     if (!playAgain.equals("yes"))
     {
       break;
     } 
   }
  }
}