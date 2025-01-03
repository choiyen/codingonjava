package _06_abstract.Practice2;

public abstract class Shape
{
    private String color;
    private String type;

    public String getColor() {
        return color;
    }

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public abstract double calculateArea();

    public String getType() {
        return type;
    }
}
