import java.util.Scanner;
class complexv2{
    double real,imaginary;
    void complexset(double r,double i)
    {
        real = r;
        imaginary= i;
    }
    complexv2()
    {
        real = imaginary =0;
    }
    complexv2 add(complexv2 c1,complexv2 c2)
    {
        complexv2 c3 = new complexv2();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }
    complexv2 sub(complexv2 c1,complexv2 c2)
    {
        complexv2 c3 = new complexv2();
        c3.real = c1.real - c2.real;
        c3.imaginary = c1.imaginary - c2.imaginary;
        return c3;
    }

    void complexget()
    {
        System.out.print(real);
        if(imaginary >=0)
            System.out.print("+");
        System.out.println(imaginary+"i");
    }
}
public class Prog1v2 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int choice;
        complexv2 c1 = new complexv2();
        complexv2 c2 = new complexv2();
        complexv2 c3 = new complexv2();
        complexv2 c4 = new complexv2();
        while(true)
        {

            System.out.print("1.Enter the complex numbers\n2.Add\n2.Subtract\nAny other key to exit\n");
            choice = s.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter the first complex number");
                        c1.complexset(s.nextDouble(),s.nextDouble());
                        System.out.println("Enter the second complex number");
                        c2.complexset(s.nextDouble(),s.nextDouble());
                        break;
                case 2: c3 = c3.add(c1,c2);
                    System.out.print("Addition result ");
                    c3.complexget();
                    break;
                case 3: c4 = c4.sub(c1,c2);
                    System.out.print("Subtraction result ");
                    c4.complexget();
                    break;
                default: System.exit(0);
            }
        }
    }
}
