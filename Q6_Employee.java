class employee
{
    String name;
    String address;
    int year;
    public employee(String n, int y, String a)
    {
        this.name = n;
        this.year = y;
        this.address = a;
    }

    public String name()
    {
        return name;
    }
    public int year()
    {
        return year;
    }
    public String address()
    {
        return address;
    }
    public static void main(String[] args)
    {
        employee emp1 = new employee("Robert", 1994, "64C- WallStreet");
        employee emp2 = new employee("Sam", 2000, "68D- WallStreet");
        employee emp3 = new employee("John", 1999, "28B- WallStreet");
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        System.out.println(emp1.name()+"\t\t"+emp1.year()+"\t\t\t\t"+emp1.address());
        System.out.println(emp2.name()+"\t\t\t"+emp2.year()+"\t\t\t\t"+emp2.address());
        System.out.println(emp3.name()+"\t\t"+emp3.year()+"\t\t\t\t"+emp3.address());
    }
}
