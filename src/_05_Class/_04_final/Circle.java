package _05_Class._04_final;

public class Circle {
    //final 필드
    private final double radius;

    //원주율 함수
    private static final double PI = 3.14159265;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getradius() {

        return radius;
    }

    public double calculateArea() {
      return radius * radius * PI;
    }
}
