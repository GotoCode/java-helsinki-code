
public class Counter
{
    // INSTANCE VARIABLES //
    
    private int counterValue;
    private boolean check;
    
    // CONSTRUCTORS //
    
    public Counter(int startingValue, boolean check)
    {
        this.counterValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue)
    {
        this(startingValue, false);
    }
    
    public Counter(boolean check)
    {
        this(0, check);
    }
    
    public Counter()
    {
        this(0, false);
    }
    
    // METHODS //
    
    public int value()
    {
        return this.counterValue;
    }
    
    public void increase()
    {
        this.counterValue++;
    }
    
    public void increase(int increaseAmount)
    {
        if (increaseAmount > 0) this.counterValue += increaseAmount;
    }
    
    public void decrease()
    {
        if (check)
        {
            if (this.counterValue > 0) this.counterValue--;
        }
        else
        {
            this.counterValue--;
        }
    }
    
    public void decrease(int decreaseAmount)
    {
        if (check)
        {
            if (!((this.counterValue - decreaseAmount) < 0)) this.counterValue -= decreaseAmount;
        }
        else
        {
            this.counterValue -= decreaseAmount;
        }
    }
}