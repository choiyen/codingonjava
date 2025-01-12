package _09_Generic;


// 참고. Number 클래스
// - JAVA에서 모든 숫자 형식의 부모 클래스
// - 정수형, 상수형 모든 정수 타입 포함
//숫자의 확장
class Box <T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

//case2
interface Moveable {
    void move();
}
//Movable 구현하는 Car 클래스
class Car implements Moveable
{

    @Override
    public void move() {
        System.out.println("자동차 출발");
    }
}
//Container 클래스는 재네릭 타입 T를 받지만 제한을 두어 Movable 인터페이스를 구현한 녀석만 가능(여기서는 Car만 가능)
class Container <T extends Moveable>
{
    private T item;

    public Container(T item)
    {
        this.item = item;
    }
    public void makeItMove()
    {
        item.move();
    }

}
public class GenericEx2
{
    public static void main(String[] args) {
        //Box<String> box = new Box<String>();// error
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(3.14);
        System.out.println(doubleBox.getItem());

        Box<Short> shortBox = new Box<>();
        shortBox.setItem((short)40);
        //(short) 형변환이 필요한 이유?
        //- java에서 정수 리터럴은 기본적으로 int로 간주됨.
        //- 명시적으로 short로 형변환 후 넘겨주어야 함.
        System.out.println(shortBox.getItem());

        //Case 2
        //Container<String> stringContainer = new Container<String>();//implements movable이 아님.
        Container<Car> carContainer = new Container<>(new Car());
        carContainer.makeItMove();
        
    }
}
