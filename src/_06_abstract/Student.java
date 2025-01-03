package _06_abstract;

public class Student extends Person{


    @Override
    public void printName()
    {
        //Student 클레스는 Person 의 추상 메서드인 printName()을 구현해야만 일반 클레스로 쓰일 수 있음.
        System.out.println("학생 :" + getName());
    }
}
