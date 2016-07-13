import java.util.ArrayList;

public class Variance
{
    public static double getVariance(ArrayList<Integer> numbers)
    {
        double variance = 0;
        int numberOfItems = numbers.size();
        double avg = SumList.average(numbers);
        
        // compute numerator of variance...
        for (int number : numbers)
        {
            variance += Math.pow((number - avg), 2);
        }
        
        // combine that with the denominator...
        variance /= (numberOfItems - 1);
        
        return variance;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        
        System.out.println("The sample variance is " + getVariance(numbers));
    }
}