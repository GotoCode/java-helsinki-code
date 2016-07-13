import java.util.Scanner;

public class FirstChar
{
    public static char getFirst(String word)
    {
        return word.charAt(0);
    }
    
    public static char getLast(String word)
    {
        return word.charAt(word.length()-1);
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = reader.nextLine();
        
        System.out.println("First char: " + getFirst(input));
        System.out.println("Last char: " + getLast(input));
    }
}