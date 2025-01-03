package _07_interface.Paractice2;

public class Main
{
    public static void main(String[] args) {
        Vehicle vehicle[] = {new Car(100, "현대산타페"), new Airplane(120,"보잉747")};
        for (int i = 0; i < vehicle.length; i++)
        {
            vehicle[i].move();
            if(vehicle[i] instanceof Airplane)
            {
                ((Airplane) vehicle[i]).fly();
            }
        }
    }

}
