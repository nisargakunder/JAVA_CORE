package Q3;

import java.util.Scanner;

class Account {
    private String name;
    private int accountno;
    private double accountbalance;
    public Account(String name, int accountno, double accountbalance){
        this.name=name;
        this.accountno=accountno;
        this.accountbalance=accountbalance;
    }
    public void deposit(double balance){
        this.accountbalance+=balance;
    }

    public int getaccountno(){
        return accountno;

    }
    public double getaccountbalance(){
        return accountbalance;
    }
    public void setaccountbalance(double amount){
        this.accountbalance=amount;

    }

}
class SavingsAccount extends Account {
    private int intrest = 5;
    private double maxwithdraw;

    public SavingsAccount(String name, int accountNumber, double accountBalance) {
        super(name, accountNumber, accountBalance);
        this.maxwithdraw = accountBalance;
    }

    public double getbalance() {
        return (super.getaccountbalance() * intrest / 100) + super.getaccountbalance();

    }

    public double withdraw(double amount) {
        if (amount < super.getaccountbalance()) {
            super.setaccountbalance(super.getaccountbalance() - amount);
            System.out.println("Amount was successfully debited");

        } else {
            System.out.println("Amount available is low");

        }

        return super.getaccountbalance();
    }




}
class CurrentAccount extends Account{
     private int tradelicenseNumber;
     private double overdraft;
     public CurrentAccount(String name, int accountNumber, double accountBalance,
                           int tradeLicenseNumber,double overdraft){
         super(name,accountNumber,accountBalance);
         this.tradelicenseNumber=tradeLicenseNumber;
         this.overdraft=overdraft;

     }
    public double getaccountbalance(){
        return super.getaccountbalance();

    }
    public double withdraw(double amount){
         double totallimit=super.getaccountbalance()+overdraft;
         if (amount<totallimit){
           super.setaccountbalance(super.getaccountbalance()-amount);

        }
         else{
             System.out.println("Available balance is less than the withdraw ammount");
         }
         return getaccountbalance();
    }

}
public class Banking{
     public static void main(String args[]){
         System.out.println("Enter 1 for Savings 2 for CurrentAccount");
         Scanner sc=new Scanner(System.in);
         int choice=sc.nextInt();
         if (choice==1){
             SavingsAccount s=new SavingsAccount("Nisarga",12345,5000);
             System.out.println(s.getbalance());
             System.out.println(s.withdraw(500));

         }
         else{
             CurrentAccount cur=new CurrentAccount("Neha",5678,1000,12,30);
             System.out.println(cur.getaccountbalance());
             System.out.println(cur.withdraw(1100));
         }
     }
}

