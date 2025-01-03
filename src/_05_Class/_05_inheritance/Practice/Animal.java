package _05_Class._05_inheritance.Practice;

public class Animal
{
    private String name;
    private String kind;
    private int age;

    public Animal(String kind, String name, int age)
    {
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    public String makeSound()
    {
        return "동물은 소리를 낸다.";
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
