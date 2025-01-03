package _05_Class._03_static;

public class Student
{
    private  String name;
    private String studentId;
    private int grade;

    // 클래스 변수로 총 학생 수를 추적하기 위한 것.
    private static int totalStudent = 0;

    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        totalStudent++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public void displayInfo()
    {
        System.out.println("===========학생 정보=================");
        System.out.println("이름 : " + this.getName());
        System.out.println("학번 : " + this.getStudentId());
        System.out.println("학년 : " + this.getGrade());
    }

}
