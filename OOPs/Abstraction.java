public class Abstraction {
    public static void main(String[] args) {
       
        BankAccount savings = new SavingsAccount("John", 10000);
        BankAccount current = new CurrentAccount("Alice", 15000);
        
        
        savings.calculateInterest();
        savings.displayBalance();
        
    
        current.calculateInterest();
        current.displayBalance();
    }
}


abstract class BankAccount {
    String accountHolder;
    private double balance;  
    
    
    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }
    
    
    abstract void calculateInterest();
    
    
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

  
    protected double getBalance() {
        return this.balance;
    }
    
   
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }
    
    @Override
    void calculateInterest() {
        double currentBalance = getBalance();
        double interest = currentBalance * 0.04; 
        setBalance(currentBalance + interest);
        System.out.println("Savings Interest: " + interest);
    }
}


class CurrentAccount extends BankAccount {
    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }
    
    @Override
    void calculateInterest() {
        double currentBalance = getBalance();
        double interest = currentBalance * 0.01;  
        setBalance(currentBalance + interest);
        System.out.println("Current Interest: " + interest);
    }
}

 // Abstraction is the process of hiding the internal implementation details of a system and exposing only the necessary functionality through a simplified interface. It enables users to interact with objects without needing to understand the underlying complexity of how operations are performed
