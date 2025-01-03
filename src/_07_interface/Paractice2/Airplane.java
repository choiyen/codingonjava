package _07_interface.Paractice2;

public class Airplane extends Vehicle implements Flyable
{
    public Airplane(int maxSpeed, String name) {
        super(maxSpeed, name);
    }

    @Override
    public void fly() {
        System.out.println("고도 10,000 피트에서 비행 중");
    }

    @Override
    public void move()
    {
        System.out.println(getName() + " (이)가"+ getMaxSpeed() +" 속도로 하늘을 날아가는 중");
    }
}
