import CSE.ThirdSem;
import RVCE.CSEDept;
public class Prog4{
    public static void main(String[] args)
    {
        CSEDept dept = new CSEDept();
        ThirdSem sem = new ThirdSem();
        dept.display();

        System.out.println("Public method overriding");
        dept.welcome();
        sem.welcome();

        System.out.println("Private method overriding");
        //dept.welcome_private();
        //sem.welcome_private();

        System.out.println("Default method overriding");
        dept.welcome_default();
        //sem.welcome_default();

        System.out.println("Protected method overriding");
        //dept.welcome_protected();
        //sem.welcome_protected();

    }
}