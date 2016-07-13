import java.util.Scanner;
import java.util.ArrayList;

public class RepeatedWord
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String repeat = "";
        
        while (true)
        {
            System.out.print("Enter a word: ");
            String input = reader.nextLine();
            
            // if the given string is already in the list...
            if (words.contains(input))
            {
                repeat = input;
                break;
            }
            
            words.add(input);
        }
        
        System.out.println("You entered the word \""+ repeat +"\" twice!");
    }
}