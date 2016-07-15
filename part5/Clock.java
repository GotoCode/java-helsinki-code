
public class Clock
{
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
    public Clock(int hours, int minutes, int seconds)
    {
        this.hours   = new BoundedCounter(0, hours, 23);
        this.minutes = new BoundedCounter(0, minutes, 59);
        this.seconds = new BoundedCounter(0, seconds, 59);
    }
    
    public void tick()
    {
        // if an overflow of any value occurs,
        // then we simply increment the "next" value
        if(seconds.count())
        {
            if(minutes.count())
            {
                hours.count();
            }
        }
    }
    
    public String toString()
    {
        return hours.value() + ":" + minutes.value() + ":" + seconds.value();
    }
}