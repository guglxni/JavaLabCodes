import java.util.Scanner;
class DemonetisationException extends Exception{
    float amount;
    DemonetisationException(float amount){
        this.amount = amount;
    }
    public String toString(){
        return "Deposit of old currency of (Rs" + amount + ") amount crosses 5,000 and cannot be deposited";
    }
}

class Account{
    float balance;
    Account(){
        balance = 500;
    }
    void deposit(float amount, String currencyType){
        String currency = currencyType.toUpperCase();
        try{
            if(currency.equals("OLD") && amount > 5000){
                throw new DemonetisationException(amount);
            }
            balance += amount;
        }
        catch (DemonetisationException e){
            System.out.println(e);
        }
    }
    void withdraw(float amount){
        if(amount > balance || (balance - amount < 500)){
            System.out.println("Cannot withdraw");
        }
        else{
            balance = balance - amount;
        }
    }
    void getBalance(){
        System.out.println("The current balance is " + balance);
    }
}

public class Prog6 {
    public static void main(String[] args){
        int choice;
        float amount;
        String currencyType;
        Scanner input = new Scanner(System.in);
        Account customer = new Account();
        while(true){
            System.out.println("1 . deposit");
            System.out.println("2 . withdraw");
            System.out.println("3 . get balance");
            System.out.println("Enter the choice");
            choice = input.nextInt();
            switch(choice){
                case 1 : {
                    System.out.println("enter the amount to deposit");
                    amount = input.nextFloat();
                    System.out.println("enter OLD or NEW (currencyType)");
                    currencyType = input.next();
                    customer.deposit(amount, currencyType);
                    break;
                }
                case 2 : {
                    System.out.println("Enter amount to be withdrawn");
                    amount = input.nextFloat();
                    customer.withdraw(amount);
                    break;
                }
                case 3 :{
                    customer.getBalance();
                }
                default: System.exit(0);
            }
        }
    }
}