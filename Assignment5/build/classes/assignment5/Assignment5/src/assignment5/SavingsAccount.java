package assignment5;
/**
 *
 * @author 732134
 */
public class SavingsAccount 
{
    private double balance;
    private double interestRate;

    public SavingsAccount(double bal, double intRate) {
        bal = balance;
        intRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
 
    public void deposit(double amount)          // Not done
    {
        
    }
    
    public void addInterest()                   // Not done
    {
        
    }
    
    public void withdraw(double amount)          // Not done
    {
        
    }

    public double getLastInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
