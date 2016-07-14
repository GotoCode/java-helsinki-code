import java.util.Random;

public class PasswordRandomizer
{
    private int length;
    private String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    public PasswordRandomizer(int length)
    {
        this.length = length;
    }
    
    public String createPassword()
    {
        String result = "";
        Random rand = new Random();
        
        int count = 0;
        
        while (count < length)
        {
            result += this.ALPHABET.charAt(rand.nextInt(26));
            count++;
        }
        
        return result;
    }
}