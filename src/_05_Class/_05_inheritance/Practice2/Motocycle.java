package _05_Class._05_inheritance.Practice2;

public class Motocycle extends Vehicle
{
    private char licenseType;

    public Motocycle(String year, String brand, String model, char licenseType ) {
        super(year, brand, model);
        this.licenseType = licenseType;
    }

    public char getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }

    public String move()
    {
        return "울림통을 합니다.";
    }

    public void Motocyclemain()
    {
        System.out.println("======== Motocycle 정보 ===========");
        System.out.println("Motocycle {brand : '" + getBrand() + "', model : '" + getModel() + "', year : '" + getYear() + "', liceseType : '" + getLicenseType() + "'}");
        System.out.println(StartUP());
        System.out.println(move());
        System.out.println(StartDown());
    }


}
