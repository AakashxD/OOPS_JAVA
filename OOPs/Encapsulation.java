package OOPs;
class BankAccount{
   protected int accountNo;
    static String IFSC="IDIBfs";
    String name;
    private double balance;
    BankAccount(int accountNo,String name,double balance){
        this.name=name;
        this.balance=balance;
        this.accountNo=accountNo;
    }
    double getBalance(){
        return this.balance;
    }
    void setBalance(double newBalance){
        this.balance=newBalance;
    }


}
class CurrentAccount extends BankAccount{
       CurrentAccount(int accountNo,String name,double balance){
                super(accountNo, name, balance);
       }
       void interest(){
         double balance= super.getBalance();
         double intersetCal=balance *0.4 ;
         super.setBalance(balance+intersetCal);

       }
}

public class Encapsulation {
    /**
     * Encapsulation means binding the data method and variable into a single unit so that i cant be access will not be in the scope
     * 
     * Question: What is Encapsulation in Java?
Answer:
Encapsulation is one of the four pillars of OOP. It’s the technique of wrapping data and methods into a single class and restricting direct access to that data using access modifiers.
For example, in a BankAccount class, the balance variable is private, and we can only access it using getter and setter methods. This helps in data hiding, security, and code maintainability. 
     *  access modifer is used
     * 
     * @param args
     * A: Because they allow validation and control before updating or exposing data.
Example: You can check that balance doesn’t go negative before setting it.
     */
    public static void main(String[] args) {
        
    }
}
