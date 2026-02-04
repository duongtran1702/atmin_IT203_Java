package atmin;

public class Circle extends Shape {

    private double radius;

    // constructor 1 tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // constructor overload (2 tham số – ví dụ có hệ số)
    public Circle(double radius, double scale) {
        this.radius = radius * scale;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
