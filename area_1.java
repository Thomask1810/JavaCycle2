import java.util.*;
class area_1
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    area_1 obj=new area_1();
    int l,b;
    double rad;
    System.out.println("Enter length and breadth of rectangle");
    l=sc.nextInt();
    b=sc.nextInt();
    obj.area(l,b);
    System.out.println("Enter radius of circle");
    rad=sc.nextDouble();
    obj.area(rad);
}
void area(int x,int y)
{
  int area=x*y;
  System.out.println("Area of rectangle="+area);
}
void area(Double x)
{
  double area=3.14285*x*x;
  System.out.println("Area of circle="+area);
}
}
