
/**
 * Write a description of class Greatest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Greatest
{
    public static int greatest(int N1, int N2, int N3)
    {
        return Math.max(Math.max(N1, N2), N3);
    }
    
    public static void main(String[] args)
    {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}