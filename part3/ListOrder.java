import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ListOrder
{
    public static void main(String[] args)
    {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true)
        {
            System.out.print("Enter a word: ");
            String input = reader.nextLine();
            
            if (input.isEmpty()) break;
            
            words.add(input);
        }
        
        // Order the list appropriately...
        Collections.sort(words);
        
        System.out.println("You typed the following words: ");
        for (String word : words) System.out.println(word);
        
    }
}