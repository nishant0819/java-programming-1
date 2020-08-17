import java.util.Scanner;
class Complex
{
    int real, img;
    Complex(int real, int img)
    {
        this.real=real;
        this.img=img;
    }
    static Complex sum(Complex a,Complex b)
    {
        return new Complex((a.real + b.real),(a.img + b.img));
    }
    static Complex difference(Complex a,Complex b)
    {
        return new Complex((a.real - b.real),(a.img - b.img));
    }
    static Complex product(Complex a,Complex b)
    {
        return new Complex(((a.real * b.real) - (a.img * b.img)),((a.real * b.img) + (a.img * b.real)));
    }
    public void display()
    {
        if(real==0 && img!=0)
            System.out.println(img+"i");
        else if(real!=0 && img==0 )
            System.out.println(real);
        else
        {
            if(img<0)
                System.out.println(real+""+img+"i");
            else
                System.out.println(real+"+"+img+"i");
        }
    }
}

class run
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers first real and then imaginary");
        int R1 = sc.nextInt();
        int I1 = sc.nextInt();
        System.out.println("Again please enter 2 numbers First real and then imaginary");
        int R2 = sc.nextInt();
        int I2 = sc.nextInt();
        Complex a = new Complex(R1, I1);
        Complex b = new Complex(R2, I2);
        Complex add = Complex.sum(a, b);
        Complex diff = Complex.difference(a, b);
        Complex prod = Complex.product(a, b);
        System.out.print("Sum = ");
        add.display();
        System.out.print("Difference = ");
        diff.display();
        System.out.print("Product = ");
        prod.display();
    }
}
