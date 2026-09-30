import ShapeManagement.Size.*;
import ShapeManagement.Square;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Square s = new Square(25.8);
        double area = s.printsqSize();
        System.out.println("Area of square: " + area);

        area a = new area(25.35);
       double A =  a.Area_();
       System.out.println("area : " + A);

           StringBuilder text = new StringBuilder("Jva");
            text.insert(1, 'a');          // "Java"
    text.append("!"); 
        text.deleteCharAt(4);         // "Java"
    text.delete(1, 3);            // "Ja"; end index exclusive
    text.replace(0, 1, "YA");    // "YAa"
    text.setCharAt(2, 'A');       // "YAA"
    text.reverse();               // "AAY"
    text.length();                // 3
    text.charAt(0);  
    }

}
