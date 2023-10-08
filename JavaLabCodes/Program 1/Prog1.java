import java.util.Scanner;
class complex{
    double real,imaginary;
    complex(double r, double i) {
        real = r;
        imaginary = i;
    }
    complex()
    {
        real = imaginary =0;
    }
    complex add(complex c1,complex c2)
    {
        complex c3 = new complex();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }
    complex sub(complex c1,complex c2)
    {
        complex c3 = new complex();
        c3.real = c1.real - c2.real;
        c3.imaginary = c1.imaginary - c2.imaginary;
        return c3;
    }

    void display()
    {
        System.out.print(real);
        if(imaginary >=0)
            System.out.print("+");
        System.out.println(imaginary+"i");
    }
}
public class Prog1 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int choice;

        double r1,i1,r2,i2;
        System.out.println("Enter the first complex number");
        r1 = s.nextDouble();
        i1 = s.nextDouble();

        System.out.println("Enter the second complex number");
        r2 = s.nextDouble();
        i2 = s.nextDouble();
        complex c1 = new complex(r1, i1);
        complex c2 = new complex(r2, i2);
        complex c3 = new complex();
        complex c4 = new complex();
        while(true)
        {

        System.out.print("1.Add\n2.Subtract\nAny other key to exit\n");
        choice = s.nextInt();
        switch(choice)
        {
            case 1: c3 = c3.add(c1,c2);
                    System.out.print("Addition result ");
                    c3.display();
                    break;
            case 2: c4 = c4.sub(c1,c2);
                    System.out.print("Subtraction result ");
                    c4.display();
                    break;
            default: System.exit(0);
        }
        }
    }
}
