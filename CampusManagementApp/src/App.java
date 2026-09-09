public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Shapes s = new Circle("red", 5);
        s.CalcArea();
        double a = s.getArea();
        System.out.println("The area of circle is : " + a);
        double b = s.getPerimeter();
        System.out.println("The circumference of circle is : " + b);

        Shapes s1 = new Rectangle("Blue",4.5,5.5);
        s1.CalcArea();
        double rectangleArea = s1.getArea();
        System.out.println("The area of rectangle is : " + rectangleArea);
        s1.CalcPerimeter();
        double RectPeri = s1.getPerimeter();
        System.out.println("The perimeter of rectangle is : " + RectPeri);
    }
}
