package _07_interface.Paractice2;

public abstract class Vehicle
{
   private String name;
   private int maxSpeed;

    public Vehicle(int maxSpeed, String name) {
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void move();
}
