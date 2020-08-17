package com.company;
import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    int empId; String empName, empDesignation, empLocation; double empSalary;
    Employee(int empId, String empName, String empDesignation, double empSalary, String empLocation)
    {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId()
    {
        this.empId = empId;
    }
    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName()
    {
        this.empName = empName;
    }
    public String getEmpDesignation()
    {
        return empDesignation;
    }
    public void setEmpDesignation()
    {
        this.empDesignation = empDesignation;
    }
    public double getEmpSalary()
    {
        return empSalary;
    }
    public void setEmpSalary()
    {
        this.empSalary = empSalary;
    }
    public String getEmpLocation()
    {
        return empLocation;
    }
    public void setEmpLocation()
    {
        this.empLocation = empLocation;
    }
    public String toString(){
        return empId+" "+empName+" "+empDesignation+" "+empSalary+" "+empLocation;
    }
}
class Employees
{
    public static void main(String[] args)
    {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "AA", "Techie", 40100, "Mumbai"),
                new Employee(2,"BB", "experte", 30000, "Mandi"),
                new Employee(3, "CC", "data analyst", 50000, "Africa"),
                new Employee(4,"DD", "web devie", 55000, "Ghana"),
                new Employee(5, "EE", "content writter", 60000, "New York"),
                new Employee(6,"FF", "writter", 31020, "Manali"),
                new Employee(7, "GG", "painter", 50000, "Delhi"),
                new Employee(8,"HH", "artist", 54240, "Punjab"),
                new Employee(9, "II", "EMCEE", 200122, "Maharashtra"),
                new Employee(10,"JJ", "Enthusiatste", 52000, "USA"));
        System.out.println("Name of Employees are-");
        emp.stream().forEach(x -> System.out.println(x.getEmpName()));
        System.out.println("\nSalaries which are greater than 50,000/-");
        emp.stream().filter(x->x.getEmpSalary()>50000).forEach(x->System.out.println(x.getEmpSalary()));
        System.out.println("\nThe locations starting with the letter ‘M’");
        emp.stream().filter(x -> x.getEmpLocation().startsWith("M")).forEach(x -> System.out.println(x.getEmpLocation()));
        System.out.println("\nThe designations ending with ‘E’");
        emp.stream().filter(x -> x.getEmpDesignation().endsWith("e")).forEach(x -> System.out.println(x.getEmpDesignation()));
        //tostring method usage
        //emp.stream().forEach(x -> System.out.println(x.toString()));
    }
}
