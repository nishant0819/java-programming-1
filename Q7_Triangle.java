import java.util.Scanner;
class Triangle
{
    public static double calculate(double a,double b, double c)
    {
        double x=(a+b+c)/2;
        double Area=Math.sqrt(x*(x-a)*(x-b)*(x-c));
        return Area;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of the triangle - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double area = calculate(a,b,c);
        System.out.println("The Area of triangle = "+ area);
    }
}