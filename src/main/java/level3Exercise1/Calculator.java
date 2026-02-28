package level3Exercise1;

public class Calculator {
    private double total;
    public Calculator()
    {
        total = 0.0;
    }

    public void add(double a)
    {
        total+=a;
    }

    public void subtract(double a)
    {
        total-=a;
    }

    public void multiply(double a)
    {
        total*=a;
    }

    public void divide(double a)
    {
        if(a==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            total/=a;
        }
    }

    public double getTotal()
    {
        return total;
    }

    public void reset()
    {
        total = 0.0;
    }
}
