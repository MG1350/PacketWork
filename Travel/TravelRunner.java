package Travel;

public class TravelRunner 
{
    public static void main(String[] args)
    {
        for(int  i = 6; i <= 40; i += 2)
        {
            Travel travel = new Travel(i);
            int v = travel.goByVan();
            int c = travel.goByCanoe();
            int p = travel.goByPlane(); 
            System.out.println("people = " + i + ", vans = " + v +  ", canoes = " +c +  ", planes = "+  p);
        }
    }
}
