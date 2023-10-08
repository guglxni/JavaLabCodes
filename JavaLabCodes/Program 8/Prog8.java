import java.util.Scanner;
public class Prog8 {
    interface check{
       int test(int option, int num);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        check chk = (option, num) -> {
            if(option == 1){
                if(num % 2 == 0){
                    System.out.println("Number is even");
                    return 1;
                }
                else{
                    System.out.println("Number is odd");
                    return 0;
                }
            }
            else if(option == 2){
                int flag = 0;
                for(int i = 2; i <= num / 2; i++){
                    if(num % i == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1){
                    System.out.println("The number is composite");
                    return 1;
                }
                else{
                    System.out.println("Number is prime");
                    return 0;
                }
            }
            else if(option == 3){
                String str = String.valueOf(num);
                char[] tempstr = str.toCharArray();
                int flag = 1;
                for(int i = 0; i < tempstr.length; i++){
                    if(tempstr[i] != tempstr[tempstr.length - i - 1]){
                        flag = 0;
                    }
                }
                if(flag == 0){
                    System.out.println("Not a palindrome");
                    return 0;
                }
                else{
                    System.out.println("Is a palindrome");
                    return 1;
                }
            }
            else{
                System.out.println("Invalid option");
            }
            return 1;

        };

        System.out.println("1. to check parity");
        System.out.println("2. To check prime of composite");
        System.out.println("3. To check if palindrome");

        while (true){
            int choice, number;
            System.out.println("Enter the choice");
            choice = input.nextInt();
            if(choice == 4){
                System.exit(0);
            }
            System.out.println("Enter the number");
            number = input.nextInt();
            chk.test(choice, number);
        }

    }
}