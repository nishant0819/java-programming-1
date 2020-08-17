import java.util.Scanner;
class Circle
{
    private long radius;
    private String color;
    Circle()
    {
        this.radius = 1;
        this.color="red";
    }
    Circle(long r)
    {
        radius = r;
    }
    long getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return (Math.PI*radius*radius);
    }
}
class Running
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();
        System.out.println("Radius of Circle is "+ obj.getRadius());
        System.out.println("Area of Circle is "+ obj.getArea());
        System.out.println("Enter the radius of Circle = ");
        long r1= sc.nextLong();
        Circle obj2 = new Circle(r1);
        System.out.println("Radius of Circle is "+ obj2.getRadius());
        System.out.println("Area of Circle is "+ obj2.getArea());
    }
}
