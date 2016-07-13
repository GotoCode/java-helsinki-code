import java.util.Scanner;

public class Palindrome
{
    public static boolean isPalindrome(String input)
    {
        int index = 0;
        
        while (index < (input.length()/2))
        {
            if (input.charAt(index) != input.charAt(input.length()-1-index)) return false;
            index++;
        }
        
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter any string: ");
        String input = reader.nextLine();
        
        System.out.println("Is the word \"" + input + "\" a palindrome? " + isPalindrome(input));
    }
}