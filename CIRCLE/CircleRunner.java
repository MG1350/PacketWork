package CIRCLE;
public class CircleRunner 
{
    public static void main(String[] args)
    {
        Circle car = new Circle(3);
        System.out.println(car.getC());
        System.out.println(car.getArea());
        car.changeR(1);
        System.out.println(car.getArea());
    }

}
