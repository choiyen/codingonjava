package _05_Class._05_inheritance.Practice;

public class Cat extends Animal
{
    private String wool;
    private double size;

    public Cat(String kind, String name, int age) {
        super(kind, name, age);
    }
    public String makeSound()
    {
        return "해당 동물은 야옹 하고 운다.";
    }
    public String makelike()
    {
        return "해당 동물은 높은 곳에 올라가는 것을 좋아한다.";
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
