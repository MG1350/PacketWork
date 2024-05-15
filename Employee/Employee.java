package Employee;

public class Employee 
{
    double salary;
    public Employee(double m)
    {
        salary = m;
    }
    public void increase(double x)
    {
        if(x>0)
        {
            salary = salary + x;
        }
    }
    public double getPay()
    {
        return salary;
    }
}
