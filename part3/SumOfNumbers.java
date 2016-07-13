
/**
 * Write a description of class SumOfNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumOfNumbers
{
    public static int sum(int N1, int N2, int N3, int N4)
    {
        return N1 + N2 + N3 + N4;
    }
    
    public static void main(String[] args)
    {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}