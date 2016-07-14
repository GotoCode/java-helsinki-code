
public class AccountMain
{
    public static void main(String[] args)
    {
        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        
        System.out.println("Before: ");
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        Account.transfer(A, B, 50);
        Account.transfer(B, C, 25);
        
        System.out.println("After: ");
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}