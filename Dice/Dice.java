package Dice;
public class Dice 
{
    int die1, die2;
    public Dice()
    {
        die1 = (int) (Math.random()*6+1);
        die2 = (int) (Math.random()*6+1);
    }
    public void roll()
    {
        die1 = (int) (Math.random()*6+1);
        die2 = (int) (Math.random()*6+1);
    }
    public int getTotal()
    {
        return die1 + die2;
    }
    public void roll100()
    {
        int sev = 0;
        int elev = 0;
        int two = 0;
        int three = 0;
        int twel = 0;
        for (int i = 0; i < 100; i++)
        {
            Dice rolled = new Dice();
            int total = rolled.getTotal();
            if(rolled.getTotal() == 7)
            {
                sev += 1;
            }
            else if(total == 11)
            {
                elev += 1;
            }
            else if(total == 2)
            {
                two += 1;
            }
            else if(total == 3)
            {
                three += 1;
            }
            else if(total == 12)
            {
                twel += 1;
            }

        }
        System.out.println("You rolled a 7 or 11\t%" + (int)((double)((sev + elev)/(100.0))*100));
        System.out.println("You rolled a 2, 3, or 6\t%" + (int)((double)((two + three + twel)/(100.0))*100));
    }
}
