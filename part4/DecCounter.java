
public class DecCounter
{
    private int initial;
    private int value;
    
    public DecCounter(int initial)
    {
        this.initial = initial;
        this.value = initial;
    }
    
    public void printValue()
    {
        System.out.println("This counter: " + this.value);
    }
    
    public void decrease()
    {
        if (this.value > 0) this.value--;
    }
    
    public void reset()
    {
        this.value = 0;
    }
    
    public void setInitial()
    {
        this.value = this.initial;
    }
}