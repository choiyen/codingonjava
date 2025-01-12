package _09_Generic.Paractice;


class Calculator<T extends Number> {
    T num1;
    T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

}
public class Paracte2
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator<Integer>(5,5);
        Calculator calculator2 = new Calculator<Double>(3.3, 3.2);
        System.out.println("Integer Sum :" + calculator.add());
        System.out.println("Double Sum :" +  calculator2.add());
    }


}
