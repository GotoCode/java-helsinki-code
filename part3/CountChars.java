import java.util.Scanner;

/**
 * Write a description of class CountChars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountChars
{
    public static int getLength(String in)
    {
        return in.length();
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = reader.nextLine();
        
        System.out.println("Length: " + getLength(name));
    }
}