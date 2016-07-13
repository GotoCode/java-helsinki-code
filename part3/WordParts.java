import java.util.Scanner;

public class WordParts
{
    public static String getFirst(String input, int len)
    {
        return input.substring(0, len);
    }
    
    public static String getLast(String input, int len)
    {
        return input.substring(input.length()-len);
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = reader.nextLine();
        
        System.out.print("Enter length of first part: ");
        int firstLen = Integer.parseInt(reader.nextLine());
        
        System.out.print("Enter length of last part: ");
        int lastLen = Integer.parseInt(reader.nextLine());
        
        System.out.println("First: " + getFirst(word, firstLen));
        System.out.println("Last: " + getLast(word, lastLen));
    }
}