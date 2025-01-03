package _05_Class._03_static;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true)
        {
            System.out.println("고객의 이름을 입력해주세요");
            String name = scan.next();

            System.out.println("학생의 학번을 입력해주세요.");
            String StudentId = scan.next();
            System.out.println("학생의 학년을 입력해주세요(0 입력 시 출력)");
            int Grade = scan.nextInt();

            if(Grade == 0)
            {
                for(Student id : students)
                {
                    id.displayInfo();
                }
                System.out.println("총 학생 수는 " + Student.getTotalStudent() + "입니다.");
                break;
            }

            students.add(new Student(name, StudentId, Grade));

        }
    }
}
