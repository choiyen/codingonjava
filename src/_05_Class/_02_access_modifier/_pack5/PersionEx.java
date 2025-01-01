package _05_Class._02_access_modifier._pack5;

public class PersionEx {
    public static void main(String[] args) {
        //객체 생성
        Persion persion = new Persion("minion");

        //persion.age = 3; // x 필드 직접 변경 불가능함.
        persion.setAge(4);
        System.out.println(persion.getName() + "의 나이는 " + persion.getAge());

        persion.setAge(-6);
        System.out.println(persion.getName() + "의 나이는 " + persion.getAge());
    }
}
