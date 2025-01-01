package _05_Class._02_access_modifier._pack5;

public class Persion
{
    private int age;
    private String name;

    public Persion(String name)
    {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age)
    {
        if(age < 0)
        {
            this.age = 0;
        }
        else
        {
            this.age = age;
        }
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
