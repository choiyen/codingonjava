package _05_Class._05_inheritance.Practice2;

public class Vehicle
{
    private String brand;
    private String model;
    private String year;

    public Vehicle(String year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    public String StartUP()
    {
        return "차량 시동을 걸었습니다.";
    }

    public String StartDown()
    {
        return "차량을 정지했습니다.";
    }

    public String fix()
    {
        return "주차했습니다.";
    }

    public void Vehiclemain()
    {
        System.out.println("======== Vehicle 정보 ===========");
        System.out.println("Vehicle {brand : '" + this.brand + "', model : '" + this.model + "', year : '" + this.year + "'}");
        System.out.println(this.StartUP());
        System.out.println(this.fix());
        System.out.println(this.StartDown());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }
}