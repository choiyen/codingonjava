package _02_control_statement;

import java.util.Scanner;

public class practice3
{
    public static double sum(double a, double b)
    {
        return a+b;
    }
    public static double minus(double a, double b)
    {
        return a-b;
    }
    public static double divide(double a, double b)
    {
        return a/b;
    }
    public static double multiply(double a, double b)
    {
        return a*b;
    }

    public static double width(double num)
    {
        return (num * num) * Math.PI;
    }
    public static double width(double num1, double num2)
    {
        return (num1 * num2);
    }
    public static double width(double num1, double num2, int div)
    {
        return (num1 * num2)/div;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요.");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

//        System.out.println("덧셈 결과 : " + sum(num1, num2));
//        System.out.println("뺄셈 결과 :" + minus(num1, num2));
//        System.out.println("나눗셈 결과 :" + divide(num1, num2));
//        System.out.println("곱셈 결과 :" + multiply(num1, num2));

        System.out.println("원의 넒이 : " + width(num1));
        System.out.println("삼각형의 넒이 : " + width(num1, num2));
        System.out.println("원의 넒이 : " + width(num1, num2, 2));

    }
}
