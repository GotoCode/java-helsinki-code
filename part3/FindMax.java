import java.util.ArrayList;

public class FindMax
{
    public static int greatest(ArrayList<Integer> numbers)
    {
        int currMax = Integer.MIN_VALUE;
        
        for (int item : numbers)
        {
            if (item > currMax) currMax = item;
        }
        
        return currMax;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> items = new ArrayList<Integer>();
        
        items.add(3);
        items.add(2);
        items.add(7);
        items.add(2);
        
        System.out.println("The largest item in list " + items + " is " + greatest(items));
    }
}