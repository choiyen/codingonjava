package _05_Class._03_static;


//정적 Static 맴버
// : 객체를 생성할 필요 없이 클레스를 통해서 바로 접근이 가능함.
// : 클래스가 메모리에 로딩이 되면 정적 맴버 바로 사용이 가능함.
// : 같이 메모리가 할당됨.
// : 클레스 이름과 함께 . 연산자로 접근이 가능함.
// : 정적 메소드와 정적 블록은 객체가 없어도 실행 가능하므로 내부에 인스턴스 필드나 메서드 사용 불가능.
// : 객체 자신을 참조하는 this도 사용할 수 없다.
// : 정적으로 선언된 필드는 객체 생성이 없어도 사용 가능하기 떄문에 생성자에서 초기화 작업을 하지 않는다.

public class Calculator {

        static double pi = 3.141592;
        static int plus(int x, int y)
        {
            return x + y;
        }

}