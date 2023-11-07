import java.util.*;
public class WordCountApplication
  {
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter a paragraph: ");
      String paragraph = sc.nextLine();
      String[] words = paragraph.split("\\s+");
        int wordCount = words.length;
   System.out.println("Total number of words: " + wordCount);
  }
}





