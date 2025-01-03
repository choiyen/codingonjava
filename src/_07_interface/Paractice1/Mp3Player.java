package _07_interface.Paractice1;

public class Mp3Player implements Music{

    private String Musicname;

    @Override
    public void play(String s) {
        this.Musicname = s;
        System.out.println("Cd 플레이어에서 '" + this.Musicname + "' 앨범을 재생합니다.");

    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 '" + this.Musicname + "' 엘범을 정지합니다.");
        this.Musicname = "";
    }
}
