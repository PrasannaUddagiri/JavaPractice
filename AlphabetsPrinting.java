import java.util.*;
public class AlphabetPrinting
  {
    public static void main(String[] args)
    {
      int start = 97;  // ASCII value of 'a'
      int end = 122;   // ASCII value of 'z'
       while (start <= end)
     {
     char alphabet = (char) start;
        System.out.print(alphabet + " ");
         start++;
        }
    }
}