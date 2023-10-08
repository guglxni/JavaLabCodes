interface Animal{

    public void eat();
    public void sound();
    public void nooflegs();
}

interface TiredAnimal extends Animal{
    public void sleep();
}

class Lion implements TiredAnimal{

    public void eat()
    {
        System.out.println("CHOMP CHOMP");
    }
    public void sound()
    {
        System.out.println("ROAAAR");
    }

    public void sleep()
    {
        System.out.println("Lion is sleeping");
    }
    public void nooflegs()
    {
        System.out.println("Lion is walking using its 4 legs\n");
    }

}

class Snake implements TiredAnimal{

    public void eat()
    {
        System.out.println("SWALLOW");
    }

    public void sound()
    {
        System.out.println("HISSSSS");
    }
    public void sleep()
    {
        System.out.println("Snake is sleeping");
    }
    public void nooflegs()
    {
        System.out.println("Snake crawls, has no legs");
    }

}


public class Prog5 {
    public static void main(String[] args)
    {
        Lion l1 = new Lion();
        Snake s1 = new Snake();
        System.out.println("LION");
        l1.eat();
        l1.sound();
        l1.sleep();
        l1.nooflegs();
        System.out.println("SNAKE");
        s1.eat();
        s1.sound();
        s1.sleep();
        s1.nooflegs();
    }
}

