package _05_Class._05_inheritance;

public class Student extends Person
{
    private String school;

    public Student(int age, String name)
    {
        super(name);//부모 클레스 생성자에 매개변수가 필요한 경우
        setAge(age);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
