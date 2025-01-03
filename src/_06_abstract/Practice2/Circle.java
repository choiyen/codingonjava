package _06_abstract.Practice2;

public class Circle extends Shape
{
    private double radius;

    public Circle(String type, String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
