import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in) ;
        String str,newstr;
        str = in.nextLine();
        String[] splitted = str.split(" ");
        System.out.println("penultimate word is " + splitted[splitted.length -2]);
        System.out.println("The spliited  words are:");
        for(int i=0;i<splitted.length;i++)
        {
            System.out.println(splitted[i]);
        }
        newstr = str.replace("python","java");
        System.out.println(newstr);
    }
}
