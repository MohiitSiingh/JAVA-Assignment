public class Circle extends Shapes
{

    private double Radius;

    public Circle(String c, double r)
    {
        super(c);
        if(r >= 0)
        {
            Radius = r;
        }
        else
        {
            Radius = 0;
        }
    }

    public double GetRadius()
    {
        return Radius;
    }

    public void SetRadius(double r)
    {
        Radius = r;
    }

    public void CalcArea()
    {
        area = 3.14 * Radius * Radius;
    }

    public void CalcPerimeter()
    {
        perimeter = 2 * 3.14 * Radius;
    }

}
