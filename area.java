import java.util.Scanner;
class area
{
  area(int x,int y)
  {
    int a=returnArea(x,y);
    System.out.println("Area of rectangle="+a);
  }
  int returnArea(int x,int y)
  {
    return(x*y);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length and breadth of rectangle");
    int l=sc.nextInt();
    int b=sc.nextInt();
    area obj=new area(l,b);
  }
}
