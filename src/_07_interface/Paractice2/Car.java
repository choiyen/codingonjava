package _07_interface.Paractice2;

public class Car extends Vehicle
{
    public Car(int maxSpeed, String name) {
        super(maxSpeed, name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "(이)가 "+ getMaxSpeed() +" 속도로 도로를 따라 이동 중");
    }
}
