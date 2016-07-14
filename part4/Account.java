
public class Account
{
    private String name;
    private double amount;
    
    public Account(String name, double amount)
    {
        this.name   = name;
        this.amount = amount;
    }
    
    public void deposit(double amount)
    {
        this.amount += amount;
    }
    
    public void withdrawal(double amount)
    {
        if (amount > amount)
        {
            System.out.println("Insufficient Funds! You only have: " + this.amount);
        }
        else
        {
            this.amount -= amount;
        }
    }
    
    public double balance()
    {
        return this.amount;
    }
    
    public static void transfer(Account from, Account to, double amount)
    {
        if (amount > from.amount)
        {
            System.out.println("Transfer failed... Insufficient funds.");
            return;
        }
        
        from.withdrawal(amount);
        to.deposit(amount);
    }
    
    public String toString()
    {
        return this.name + " balance is now: " + this.balance();
    }
}