package BOX;
public class BoxRunner 
{
    public static void main(String[] args)
    {
        Box bob = new Box(2, 6);
        System.out.println(bob.getArea());
        bob.bigger(2);
        System.out.println(bob.getPerimeter());
    }
    
}
