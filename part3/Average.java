
/**
 * Write a description of class Average here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Average
{
    public static int sum(int N1, int N2)
    {
        return N1 + N2;
    }
    
    public static double average(int N1, int N2, int N3, int N4)
    {
        return (double) sum(sum(N1, N2), sum(N3, N4)) / 4;
    }
    
    public static void main(String[] args)
    {
        double answer = average(4, 3, 6, 1);
        System.out.println("Average: " + answer);
    }
}