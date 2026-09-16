public class Square extends Shapes
{

    private double side;

    public double GetSide()
    {
        return side;
    }

    public void SetSide(double s)
    {
        side = s;
    }

    public Square(String clr , double s)
    {
        super(clr);
        if(s>=0)
        {
            side = s;
        }
        else
        {
            side = 0;
        }
    }

    public void CalcArea()
    {
        area = side*side;
    }

    public void CalcPerimeter()
    {
        perimeter = 4 * side;
    }
}
