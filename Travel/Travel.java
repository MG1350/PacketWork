package Travel;

public class Travel 
{
    private int people;
    public Travel(int n)
    {
        people = n;
    }
    public int goByVan()
    {
       int vans = people/8;
       if((people%8) > 0)
       {
           vans += 1;
       }
       return vans;
    }
    public int goByCanoe()
    {
        int canoes = people/3;
        if((people%3) > 0)
       {
           canoes += 1;
       }
       return canoes;
    }
    public int goByPlane()
    {
        int planes = people/12;
        if((people%12) > 0)
       {
           planes += 1;
       }
       return planes;
    }
    
}
