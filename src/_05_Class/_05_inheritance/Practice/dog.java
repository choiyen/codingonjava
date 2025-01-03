package _05_Class._05_inheritance.Practice;

public class dog extends Animal
{
    private String wool;
    private double size;

    public dog(String kind, String name, int age) {
        super(kind, name, age);
    }
    public String makeSound()
    {
        return "해당 동물은 멍멍 하고 운다.";
    }
    public String makelike()
    {
        return "해당 동물은 멀리 뛰어다니는 걸 좋아한다.";
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
