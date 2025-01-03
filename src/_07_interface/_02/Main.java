package _07_interface._02;

public class Main
{
    public static void main(String[] args) {
        SUV mySuv = new SUV();
        mySuv.PowerOn();
        mySuv.moveForward();
        mySuv.changeGear(3);
        mySuv.moveBackward();
        mySuv.PowerOff();
    }
}
