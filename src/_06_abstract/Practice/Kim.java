package _06_abstract.Practice;

public class Kim extends Student{

    public Kim(String name, String school, int school_name, int age) {
        super(name, school, school_name, age);
    }

    @Override
    public void todo() {
        System.out.println("====="+ getName() + " 학생의 정보 ==========");
        System.out.println("학교 : " +getSchool());
        System.out.println("나이 : " +getAge());
        System.out.println("학번 : " + getSchool_name());
        System.out.println("점심은 김가네 김밥");
    }
}
