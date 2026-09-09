public abstract class Shapes {
    
    private String color;
    protected double area;
    protected double perimeter;
    
    public abstract void CalcArea();
    public abstract void CalcPerimeter();

    public Shapes (String color)
    {
        this.color = color;
    }

    public String GetColor()
    {
        return color;
    }

    public void SetColor(String c)
    {
        color = c;
    }
    
    public double getArea()
    {
        return area;
    }
    public double getPerimeter()
    {
        return perimeter;
    }

    
}
