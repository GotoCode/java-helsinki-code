import java.util.Scanner;

public class ReverseName
{
    public static String getReverse(String input)
    {
        String result = "";
        
        int count = input.length() - 1;
        
        while (count >= 0)
        {
            result += input.charAt(count);
            count--;
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        
        System.out.println("Reversed: " + getReverse(reader.nextLine()));
    }
}