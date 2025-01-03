package _05_Class._05_inheritance.Practice2;

public class Bus extends Vehicle
{
    private int passengerCapacity;


    public Bus(String year, String brand, String model, int passengerCapacity)
    {
        super(year, brand, model);
        this.passengerCapacity = passengerCapacity;
    }

    public String drive()
    {
        return "승객을 운송합니다.";
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public void Busmain()
    {
        System.out.println("======== Bus 정보 ===========");
        System.out.println("Bus {brand : '" + getBrand() + "', model : '" + getModel() + "', year : '" + getYear() + "', passengerCapapcity : '" + getPassengerCapacity() + "'}");
        System.out.println(StartUP());
        System.out.println(drive());
        System.out.println(StartDown());
    }
}
