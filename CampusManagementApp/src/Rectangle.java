public class Rectangle extends Shapes {

    private double length;
    private double width;

    public double getLength()
    {
        return length;
    }

    public void SetLength(double l)
    {
        length = l ;
    }

    public double getWidth()
    {
        return width;
    }

    public void SetWidth(double w)
    {
        width = w;
    }
    public Rectangle(String c , double l, double w)
    {
        super(c);
        if(l>=0)
        {
        length = l;
        }
        else 
        {
            length = 0;
        }
        if(w>=0)
        {
            width = w;
        }
        else
        {
            width = 0;
        }
    }

    public void CalcArea()
    {
        area = length*width;
    }
    
    public void CalcPerimeter()
    {
        perimeter = length*width;
    }

    
        
    
}
