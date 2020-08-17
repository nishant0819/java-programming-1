import java.util.Scanner;
class Rectangle
{
    int width,height;
    void display(int width,int height)
    {
        System.out.println("Width is "+width+" Height is "+height);
    }
}
class RectangleArea extends Rectangle
{
    void read_input()
    {
        Scanner sc = new Scanner(System.in);
        width=sc.nextInt();
        height=sc.nextInt();
    }
    void display()
    {
        System.out.println("Area of rectangle is "+width*height);
    }
}
class runnable
{
    public static void main(String[] args)
    {
        RectangleArea obj=new RectangleArea();
        obj.read_input();
        obj.display(obj.width, obj.height);
        obj.display();
    }
}
