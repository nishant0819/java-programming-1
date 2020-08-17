package com.company;
import java.util.*;
class customException extends Exception
{
    customException(String s)
    {
        super(s);
    }
}
class exc
{
    void genericMethod()throws customException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number = ");
        int n=sc.nextInt();
        double x= ((2.0*n)/3.0);
        System.out.print("2/3rd of this number is "+x);
    }
    public static void main(String[] args)
    {
       try
       {
            exc obj = new exc();
            obj.genericMethod();
        }
        catch(Exception e)
        {
            System.out.println("EXCEPTION OCCURRED:://Generic Method only accept integer values//");
        }
    }
}