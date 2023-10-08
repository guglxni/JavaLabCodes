
class Circle {
     double radius;
     String color;

    Circle(){
        radius = 1.0;
        color = "blue";
    }
    Circle(double r)
    {
        radius = r;
        color = "blue";
    }
    Circle(double r,String c)
    {
        radius = r;
        color = c;
    }
    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {

        return color;
    }
    public double getArea()
    {
        return Math.PI * radius *radius;
    }
}

class Cylinder extends Circle{
    private double height;

    Cylinder(){
        super();
        height = 1.0;
    }
    Cylinder(double h)
    {
        super();
        height = h;
    }
    Cylinder(double r,double h)
    {
        super(r);
        height = h;
    }
    Cylinder(double r,double h,String c)
    {
        super(r,c);
        height = h;
        color = c;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return (2*Math.PI*radius*height)+ (2 * super.getArea());
    }
    public double getVolume()
    {
        return super.getArea() * height;
    }
}
public class Prog3 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The radius is "+c1.getRadius() + " The color is " + c1.getColor()+" The area is "+c1.getArea());
        Circle c2 = new Circle(3);
        System.out.println("The radius is "+c2.getRadius() + " The color is " + c2.getColor()+" The area is "+c2.getArea());
        Circle c3 = new Circle(5,"green");
        System.out.println("The radius is "+c3.getRadius() + " The color is " + c3.getColor()+" The area is "+c3.getArea());
        Cylinder cy1 = new Cylinder();
        System.out.println("The radius is "+cy1.getRadius() +" The height is "+ cy1.getHeight()+" The color is " + cy1.getColor()+" The area is "+cy1.getArea()+" The volume is "+cy1.getVolume());
        Cylinder cy2 = new Cylinder(5);
        System.out.println("The radius is "+cy2.getRadius() +" The height is "+ cy2.getHeight()+" The color is " + cy2.getColor()+" The area is "+cy2.getArea()+" The volume is "+cy2.getVolume());
        Cylinder cy3 = new Cylinder(2,3);
        System.out.println("The radius is "+cy3.getRadius() +" The height is "+ cy3.getHeight()+" The color is " + cy3.getColor()+" The area is "+cy3.getArea()+" The volume is "+cy3.getVolume());
        Cylinder cy4 = new Cylinder (2,3,"yellow");
        System.out.println("The radius is "+cy4.getRadius() +" The height is "+ cy4.getHeight()+" The color is " + cy4.getColor()+" The area is "+cy4.getArea()+" The volume is "+cy4.getVolume());

        if(cy3.getRadius() == cy4.getRadius() && cy3.getHeight() == cy4.getHeight() && cy3.getColor().equals(cy4.getColor()))
        {
            System.out.println("The cylinders 4 and 3 are same\n");
        }
        else
        {
            System.out.println("The cylinders 4 and 3 are different");
        }
    }

}