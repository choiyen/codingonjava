package _05_Class._02_access_modifier._pack4;
import _05_Class._02_access_modifier._pack3.A;

public class C
{
    public static void main(String[] args) {
        A a = new A();
        a.field1 = 11;
        //a.field2 = 22// 에러 발생;
        //a.field3 = 33;// X : private 이기 때문에 컴파일 에러

        a.method1();
        //a.method2();
        //a.method3();//내부에서만 접근 가능
    }
}
