import java.util.Scanner;

public class SubstringCheck
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String firstStr = reader.nextLine();
        
        System.out.print("Enter the second string: ");
        String secondStr = reader.nextLine();
        
        // if we find that 2nd string is substring of 1st one
        if (firstStr.indexOf(secondStr) != -1)
        {
            System.out.println("The string \"" + secondStr + "\" IS a subtring of \"" + firstStr + "\"");
        }
        else
        {
            System.out.println("The string \"" + secondStr + "\" is NOT a subtring of \"" + firstStr + "\"");
        }
    }
}