package _06_abstract.Practice;

public abstract class Student {
    private String name;
    private String school;
    private int age;
    private int school_name;

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getSchool_name() {
        return school_name;
    }

    public Student(String name, String school, int school_name, int age) {
        this.name = name;
        this.school = school;
        this.school_name = school_name;
        this.age = age;
    }

    public abstract void todo();
}
