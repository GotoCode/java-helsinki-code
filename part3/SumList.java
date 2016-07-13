import java.util.ArrayList;

public class SumList
{
    public static int sum(ArrayList<Integer> numbers)
    {
        int sum = 0;
        
        for (int number : numbers) sum += number;
        
        return sum;
    }
    
    public static double average(ArrayList<Integer> numbers)
    {
        int total = sum(numbers);
        
        return (double) total / numbers.size();
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        
        System.out.println("Average: " + average(numbers));
    }
}