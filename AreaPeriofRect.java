import java.util.*;
class AreaPeriofRect
{
public static void main(String args[])
{
int area,perimeter,length,width;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of length");
length=sc.nextInt();
System.out.println("enter the value of width");
width=sc.nextInt();
area=length*width;
perimeter=2*(length+width);
System.out.println("The area of the rectangle is:", +area);
System.out.println("The perimeter of the rectangle is:", +perimeter);
}
}