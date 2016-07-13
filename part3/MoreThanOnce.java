import java.util.Scanner;
import java.util.ArrayList;

public class MoreThanOnce
{
    public static String toYesNo(boolean truthValue)
    {
        if (truthValue)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    
    public static boolean moreThanOnce(ArrayList<Integer> ints, int number)
    {
        int count = 0;
        
        for (int item : ints)
        {
            if (item == number) count++;
        }
        
        return count > 1;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Does the number " + number + " appear more than once? " + toYesNo(moreThanOnce(numbers, number)));
    }
}