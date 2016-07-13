import java.util.Scanner;
import java.util.ArrayList;

public class WordList
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        // Read in each word one-by-one and store into words list...
        while (true)
        {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            
            if (input.isEmpty()) break;
            
            words.add(input);
        }
        
        // Display all words typed in by user...
        System.out.println("You typed in the following words:");
        for (String word : words)
        {
            System.out.println(word);
        }
    }
}