package com.company;
import java.util.Scanner;
@FunctionalInterface
interface Calc
{
    double calculate(double a, double b);
}
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double x,y;
        System.out.println("Enter:\n1 For Addition\n2 For Difference\n3 For Product\n4 For Division");
        System.out.println("Please enter your choice = ");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the values of a =");
                x= sc.nextDouble();
                System.out.println("Enter the values of b =");
                y= sc.nextDouble();
                Calc add =(double a, double b)->{return (a+b);};
                System.out.println("Addition is " + add.calculate(x,y));
                break;
            case 2:
                System.out.println("Enter the values of a =");
                x= sc.nextDouble();
                System.out.println("Enter the values of b =");
                y= sc.nextDouble();
                Calc difference=(double a, double b)->{return (a-b);};
                System.out.println("Difference is " + difference.calculate(x,y));
                break;
            case 3:
                System.out.println("Enter the values of a =");
                x= sc.nextDouble();
                System.out.println("Enter the values of b =");
                y= sc.nextDouble();
                Calc product=(double a, double b)->{return (a*b);};
                System.out.println("Product is " + product.calculate(x,y));
                break;
            case 4:
                System.out.println("Enter the values of a =");
                x= sc.nextDouble();
                System.out.println("Enter the values of b =");
                y= sc.nextDouble();
                Calc safeDivision=(double a, double b)->{return (a/b);};
                System.out.println("safeDivision is " + safeDivision.calculate(x,y));
                break;
            default:
                System.out.println("You've entered the wrong choice !");
        }
    }
}