package CIRCLE;
public class Circle 
{
    private double radius;
    public Circle(double r)
    {
        radius = r;
    }
    public double getArea()
    {
        double a = Math.PI * radius * radius;
        return a;
    }
    public double getC()
    {
        double a = Math.PI * 2 * radius;
        return a;
    }
    public void changeR(double r)
    {
        radius = r;
    }
}
