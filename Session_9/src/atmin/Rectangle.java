package atmin;

import java.util.ArrayList;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    // overload method
    public double area(double scale) {
        return (width * scale) * (height * scale);
    }

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Circle(3, 2)); // constructor overload

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area(); // đa hình
        }

        System.out.println("Total area = " + totalArea);
    }
}
