package _05_Class._02_access_modifier._pack2;
import _05_Class._02_access_modifier._pack1.B;

public class C
{
    //A a;//X안됨
    B b;//진행됨

    //C클래스 A, B 클래스의 패키지가 다름
    //default 제한자인 A클래스에선 에러 발생
    //public 제한자인 B 클래스는 가능

}
