import java.util.Scanner;
class triangle
{
    triangle()
    {
        int p=perimeter(3,4,5);
        System.out.println("Perimeter of triangle="+p);
        double a=area(3,4,5);
        System.out.println("Area of triangle="+a);
    }

    int perimeter(int x,int y , int z)
    {
        return (x + y + z);
    }
    double area(int x, int y, int z)
    {
        return (0.5 * 3 * 4);
    }
    public static void main(String[] args)
     {
        triangle obj = new triangle();
    }
}
