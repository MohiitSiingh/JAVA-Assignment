public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Shapes s = new Circle("red", 5);
        s.CalcArea();
        double a = s.getArea();
        
    }
}
