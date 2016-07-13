import java.util.ArrayList;

public class LengthsMap
{
    public static ArrayList<Integer> getLengths(ArrayList<String> words)
    {
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        for (String word : words) results.add(word.length());
        
        return results;
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        
        words.add("Hallo");
        words.add("Samosa");
        words.add("This is Java!");
        words.add("That is C++!");
        words.add("This is better than that... :)");
        
        ArrayList<Integer> lengths = getLengths(words);
        
        System.out.println("Lengths: " + lengths);
    }
}