public class ShapeManagementApp {

    public void SMA() {

        // Creating an array for storing different types of shapes
        // because Shape is the parent class of all shapes
        Shape[] arr = new Shape[5];

        // Creating circle object with radius 10
        arr[0] = new Circle(10);

        // Creating square object with negative value
        // negative value will be converted into positive value
        arr[1] = new Square(-10);

        // Creating another circle object
        arr[2] = new Circle(20);

        // Creating rectangle with negative height
        arr[3] = new Rectangle(-10, 15);

        // Creating rectangle with negative width
        arr[4] = new Rectangle(1, -20);

        // Looping through all shapes one by one
        for (int i = 0; i < arr.length; i++) {

            // Displaying the details of current shape
            arr[i].Display();
        }

        // Printing the total perimeter of all the shapes
        System.out.println(
            "Total Perimeter: " +
            Double.toString(Shape.totalPerimeter)
        );
    }

    private abstract class Shape {

        private String name;

        public static double totalPerimeter = 0;

        public abstract double area();

        public abstract double perimeter();

        Shape(String name) {
            this.name = name;
        }

        public void Display() {

            System.out.println("Name: " + name);

            double calculatedArea = area();
            System.out.println(
                "Area: " + Double.toString(calculatedArea)
            );

            double calculatedPerimeter = perimeter();
            System.out.println(
                "Perimeter: " + Double.toString(calculatedPerimeter)
            );

            System.out.println();
        }
    }

    private class Circle extends Shape {

        private double radius;

        @Override
        public double area() {
            double result = 3.14 * radius * radius;
            return result;
        };

        @Override
        public double perimeter() {
            double result = 2 * 3.14 * radius;
            return result;
        };

        Circle(double radius) {
            super("Circle");

            if (radius < 0) {
                this.radius = radius * (-1);
            } else {
                this.radius = radius;
            }

            totalPerimeter = totalPerimeter + perimeter();
        }
    }

    private class Square extends Shape {

        private double side;

        @Override
        public double area() {
            double result = side * side;
            return result;
        };

        @Override
        public double perimeter() {
            double result = 4 * side;
            return result;
        };

        Square(double side) {
            super("Square");

            if (side < 0) {
                this.side = side * (-1);
            } else {
                this.side = side;
            }

            totalPerimeter = totalPerimeter + perimeter();
        }
    }

    private class Rectangle extends Shape {

        private double height;
        private double width;

        @Override
        public double area() {
            double result = height * width;
            return result;
        };

        @Override
        public double perimeter() {
            double result = 2 * (height + width);
            return result;
        };

        Rectangle(double height, double width) {
            super("Rectangle");

            if (height < 0) {
                this.height = height * (-1);
            } else {
                this.height = height;
            }

            if (width < 0) {
                this.width = width * (-1);
            } else {
                this.width = width;
            }

            totalPerimeter = totalPerimeter + perimeter();
        }
    }
}