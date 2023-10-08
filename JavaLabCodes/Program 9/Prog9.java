import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<String> lis, arrayList, clonelist;

        System.out.print("Enter the size of list: ");
        int n=input.nextInt();
        lis=new ArrayList<>(n);
        input.nextLine();
        System.out.println("Enter "+n+" colours:");

        for(int i=0;i<n;i++)
            lis.add(input.nextLine());
        System.out.println(lis);

        int ch; String str;
        while(true) {
            System.out.println("Enter your choice:\n" +
                    "1. Add elements to List\n" +
                    "2. Copy ArrayList to Array\n" +
                    "3. Reverse ArrayList content\n" +
                    "4. Get Sub list from an ArrayList.\n" +
                    "5. To sort the ArrayList\n" +
                    "6. To clone the ArrayList\n" +
                    "7. Exit");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the number of new elements:");
                    int x= input.nextInt();
                    System.out.println("Enter the elements:");
                    for(int i=0;i<x;i++){
                        str=input.next();
                        lis.add(str);
                    }
                    System.out.println(lis);
                    break;
                case 2:
                    String[] arr= lis.toArray(new String[0]);
                    System.out.println("Array: ");
                    for(String s:arr){
                        System.out.print(s);
                    }
                    break;
                case 3:
                    System.out.println("Before reversing:");
                    System.out.println(lis);
                    System.out.println("After reversing:");
                    Collections.reverse(lis);
                    System.out.println(lis);
                    break;
                case 4:
                    System.out.println("Enter the start index:");
                    int start=input.nextInt();
                    if(start>=0){
                        System.out.println("Enter the end index:");
                        int end=input.nextInt();
                        if(end<lis.size()){
                            arrayList=new ArrayList<String>(lis.subList(start,end));
                            System.out.println("Sublist:");
                            System.out.println(arrayList);
                            break;
                        }
                    }
                    System.out.println("Invalid");
                    break;
                case 5:
                    System.out.println("Before sorting:");
                    System.out.println(lis);
                    System.out.println("After sorting:");
                    Collections.sort(lis);
                    System.out.println(lis);
                    break;
                case 6:
                    clonelist=(ArrayList<String>)lis.clone();
                    System.out.println("The clone is:");
                    System.out.println(clonelist);
                    break;
                default:
                    return;
            }
        }

    }
}