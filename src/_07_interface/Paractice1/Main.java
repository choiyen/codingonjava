package _07_interface.Paractice1;

public class Main
{
    public static void main(String[] args) {

        Music m;

        m = new Mp3Player();
        System.out.println("========= CD player ==========");
        m.play("아이유 블루밍");
        m.stop();
        m = new CdPlayer();
        System.out.println("========= CD player ==========");
        m.play("아이유 꽃깔피");
        m.stop();

    }

}
