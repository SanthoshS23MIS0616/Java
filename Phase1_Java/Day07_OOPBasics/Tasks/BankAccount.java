/*
Question:
How can you create a Java program to Create private fields accountNo, holderName, and balance with deposit and withdraw methods that validate inputs?
*/

import java.util.Scanner;
class Bankacc{

    private int accountn;
    private String holder;
    private int balance;


    public Bankacc(int accountn,String holder, int balance){
        this.accountn = accountn;
        this.holder = holder;
        this.balance = balance;
    }

    public int getaccountn()
    {
        return accountn;
    }
    
    public String getholder()
    {
        return holder;
    }
    
    public int getbalance()
    {
        return balance;
    }
    public void setbalance(int balance)
    {
        this.balance = balance;
    }

    public void deposit(int amount){
        if( amount >0){
            balance += amount ;
            System.out.println("deposited:" + balance);
        }
        else{
            System.out.println("not deposited:" + balance);
        }
    }

    public void withdraw(int amount){
        if( amount >0 && amount<= balance){
            balance -= amount ;
            System.out.println("withdraw:" + balance);
        }
        else{
            System.out.println("not withdrawn:" + balance);
        }
    }

}

class Savingsaccount extends Bankacc {

    public Savingsaccount(int accountn ,String holder, int balance){
        
        super(accountn,holder, balance);
    }
    @Override
     public void deposit(int amount){
        if( amount >0){
           setbalance(getbalance() + amount);
            System.out.println("deposited:" + amount);
        }
        else{
            System.out.println("not deposited:");
        }
    }
    @Override
    public void withdraw(int amount){
        if( amount >0 && amount<= getbalance()){
            setbalance(getbalance() - amount);
            System.out.println("withdrawamounthdraw:" + amount);
        }
        else{
            System.out.println("not withdrawn:");
        }
    }


}
public class BankAccount{
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accountnumber:");
        int accountn = sc.nextInt();
        System.out.println("enter name:");
        String holder = sc.next();

        System.out.println("enter the amount u had : ");
        int balance = sc.nextInt();
        Savingsaccount acc = new Savingsaccount(accountn, holder, balance);
        for (int i =0;i <10;i++){
            System.out.println("select deposit or withdraw:-");
            String ss = sc.next();
            if(ss.equalsIgnoreCase("deposit")){
                System.out.println("enter amount to deposit:");
                int amount =sc.nextInt();
                acc.deposit(amount);
                System.out.println("account no:"+ acc.getaccountn());
                System.out.println("account holder :"+ acc.getholder());
                System.out.println("account balance:"+ acc.getbalance());
            }
            else
            {
                 System.out.println("enter amount to withdraw:");
                int amount =sc.nextInt();
                acc.withdraw(amount);
                System.out.println("account no:"+ acc.getaccountn());
                System.out.println("account holder :"+ acc.getholder());
                System.out.println("account balance:"+ acc.getbalance());
            }
        }
       
        System.out.println("account no:"+ acc.getaccountn());
        System.out.println("account holder :"+ acc.getholder());
        System.out.println("account balance:"+ acc.getbalance());
    }

}


