import java.util.Scanner;

public class AllChars
{
    public static String allChars(String input)
    {
        String result = "";
        int count = 0;
        
        while (count < input.length())
        {
            result += (count + 1) + ". character: " + input.charAt(count) + "\n";
            count++;
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String input = reader.nextLine();
        
        System.out.println(allChars(input));
    }
}