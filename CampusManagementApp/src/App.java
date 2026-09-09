public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Shapes s = new Circle("red", 5);
        s.CalcArea();
        double a = s.getArea();
        Shapes s1 = new Rectangle("Blue",4.5,5.5);
        s1.CalcArea();
        double rectangleArea = s1.getArea();
        s1.CalcPerimeter();
        double RectPeri = s1.getPerimeter();
    }
}
