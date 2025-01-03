package _05_Class._04_final;

import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요(double 형)");
        double radius = scan.nextDouble();
        Circle circle = new Circle(radius);
        double area = circle.calculateArea();
        System.out.println("원의 반지름 :" + circle.getradius());
        System.out.println("원의 넒이 :" + circle.calculateArea());

        scan.close();
    }
}
