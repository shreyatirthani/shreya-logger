package interest;
import java.util.*;

public class Interest
{
    int principal,time;
    double rate,interest;

   public Interest(int principal,double rate,int time)
    {
        this.principal=principal;
        this.rate=rate;
        this.time=time;
        this.interest=0;
    }

    public String getInterest()
{
    return String.valueOf(this.interest);
}
}