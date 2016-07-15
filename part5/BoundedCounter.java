/*
 * The bounded counter counts from minValue
 * to maxValue (inclusive) and rolls over to
 * minValue when it exceeds maxValue
 */
public class BoundedCounter
{
    private int currValue;
    
    private int minValue;
    private int maxValue;
    
    public BoundedCounter(int minValue, int startingValue, int maxValue)
    {
        this.minValue  = minValue;
        this.maxValue  = maxValue;
        this.currValue = startingValue;
    }
    
    // returns TRUE iff an overflow occurred
    public boolean count()
    {   
        if (++this.currValue > this.maxValue)
        {
            this.currValue = this.minValue;
            return true;
        }
        
        return false;
    }
    
    public int value()
    {
        return this.currValue;
    }
}