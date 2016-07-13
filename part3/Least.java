
/**
 * Write a description of class Least here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Least
{
    public static int least(int N1, int N2)
    {
        return Math.min(N1, N2);
    }
    
    public static void main(String[] args)
    {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }
}