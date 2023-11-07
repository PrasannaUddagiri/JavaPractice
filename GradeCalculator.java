import java.util.*;
public class GradeCalculator
  {
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the student's test scores (separated by spaces): ");
     double[] testScores = new double[5]; 
     for (int i = 0; i < 5; i++)
       {
         testScores[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double score : testScores)
        {
            sum += score;
        }
        double averageScore = sum / 5;
        char letterGrade;
        if (averageScore >= 90) 
        {
            letterGrade = 'A';
        } 
        else if (averageScore >= 80)
        {
            letterGrade = 'B';
        } 
        else if (averageScore >= 70)
        {
            letterGrade = 'C';
        }
        else if (averageScore >= 60)
        {
            letterGrade = 'D';
        } 
        else
        {
            letterGrade = 'F';
        }
     System.out.println("The student's letter grade is: " + letterGrade);
    }
}