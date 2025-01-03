package _07_interface.Paractice1;

public class CdPlayer implements Music {

    private String Musicname;

    @Override
    public void play(String s) {
        this.Musicname = s;
        System.out.println("MP3 플레이어에서 '" + this.Musicname + "' 음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 '" + this.Musicname + "' 음악을 정지합니다.");
        this.Musicname = "";
    }
}
