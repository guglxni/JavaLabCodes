package CSE;

public class ThirdSem{
    public void welcome(){
        System.out.println("Welcome to OOPs Lab");
    }
    private void welcome_private() {

        System.out.println("Welcome to OOPs Lab (Private)");
    }

    void welcome_default() {

        System.out.println("Welcome to OOPs Lab (Default)");
    }

    protected void welcome_protected() {

        System.out.println("Welcome to OOPs Lab (protected)");
    }

    public void display() {

        System.out.println("Inside display method");
    }

}