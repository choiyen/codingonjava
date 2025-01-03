package _05_Class._05_inheritance.Practice2;

public class Car extends Vehicle
{
    private Boolean convertible;

    public Car(String year, String brand, String model, Boolean convertible) {
        super(year, brand, model);
        this.convertible = convertible;

    }

    public Boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    public void Carmain()
    {
        System.out.println("======== Car 정보 ===========");
        System.out.println("Car {brand : '" + getBrand() + "', model : '" + getModel() + "', year : '" + getYear() + "', convertible : '" + getConvertible() + "'}");
        System.out.println(StartUP());
        System.out.println(fix());
        System.out.println(StartDown());

    }
}
