package _07_interface._01;

public class Audio implements RemoteControl
{
    private int volume;
    //필드

    @Override
    public void turnOn() {
        System.out.println("Audio 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 끄기");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스 상수 필드를 이용하여 volume 필드의 값 제한
        if(volume > RemoteControl.MAX_VOLUME)
        {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME)
        {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else
        {
            this.volume = volume;
        }

        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}