package _07_interface._02;

public class SUV implements Car{


    @Override
    public void changeGear(int gear)
    {
        System.out.println("기어 변경" + gear);
    }

    @Override
    public void moveForward() {
        System.out.println("전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진");
    }

    @Override
    public void PowerOn()
    {
        System.out.println("시동 킨다");
    }

    @Override
    public void PowerOff() {
        System.out.println("시동 끈다.");
    }
}
