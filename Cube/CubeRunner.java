package Cube;

public class CubeRunner 
{
    public static void main(String[] args)
    {
        Cube c = new Cube(3);
        System.out.println(c.surfaceArea() + " Surface Area " + c.volume() + " Volume ");
        c.setSideForVolume(125);
        System.out.println(c.getSide() + " Side " + c.surfaceArea() + " Surface Area");
    }
}
