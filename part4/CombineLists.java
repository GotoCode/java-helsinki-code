import java.util.ArrayList;

public class CombineLists
{
    public static void combineLists(ArrayList<Integer> L1, ArrayList<Integer> L2)
    {
        L1.addAll(L2);
    }
    
    public static void smartCombine(ArrayList<Integer> L1, ArrayList<Integer> L2)
    {
        for (int item : L2)
        {
            if (!L1.contains(item))
            {
                L1.add(item);
            }
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> numsList1 = new ArrayList<Integer>();
        ArrayList<Integer> numsList2 = new ArrayList<Integer>();
        
        numsList1.add(2);
        numsList1.add(3);
        numsList1.add(4);
        
        numsList2.add(5);
        numsList2.add(6);
        numsList2.add(3);
        
        smartCombine(numsList1, numsList2);
        
        System.out.println("List 1: " + numsList1);
        System.out.println("List 2: " + numsList2);
    }
}