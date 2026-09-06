class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this(1, 1);
    }

    Rectangle(double side) {
        this(side, side);
    }

    Rectangle(double width, double height) {

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "Dimensions must be positive"
            );
        }

        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

    boolean scale(double factor) {

        if (factor <= 0)
            return false;

        width *= factor;
        height *= factor;

        return true;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                width + " x " + height +
                ", Area = " + getArea() +
                ", Perimeter = " + getPerimeter();
    }
}