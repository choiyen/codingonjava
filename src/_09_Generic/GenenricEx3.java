package _09_Generic;

//사람 객체를 만듬
// Persion
//- Teacher
//- Student
//  - WebStudent
//  - MobileStudent

import _05_Class._02_access_modifier.Practice;

class Persion {

}
class Student extends Persion
{

}
class Teacher extends Persion
{

}
class WebStudent extends Student {

}
class MobileStudent extends Student
{

}

//등록
// - 특정 종류(T)의 Applicant 를 나타내는 클래스
class Applicant <T>
{
    public T Kind;

    public Applicant(T kind)
    {
        Kind = kind;
    }
}

// 과정
class Course {
// 모든 사람 등록 가능
    public static void registerA(Applicant<?> applicant) //모든 애들이 가능
    {
         System.out.println(applicant.Kind.getClass().getSimpleName() + "이(가) CourseA 등록함");//클레스명이 나옴
    }
    //Student 또는 Student의 자식만 등록 가능
    public static void registerB(Applicant<? extends Student> applicant) //모든 애들이 가능
    {
        System.out.println(applicant.Kind.getClass().getSimpleName() + "이(가) CourseB 등록함");//클레스명이 나옴
    }
    // Teacher 나 Student가 아닌 Persion만 등록 가능
    public static void registerC(Applicant<? super Teacher> applicant) //모든 애들이 가능
    {
        System.out.println(applicant.Kind.getClass().getSimpleName() + "이(가) CourseC 등록함");//클레스명이 나옴
    }
}

public class GenenricEx3
{
    public static void main(String[] args) {
        //모든 사람이 신청 가능한 CourseA
        Course.registerA(new Applicant<Persion>(new Persion()));
        Course.registerA(new Applicant<Teacher>(new Teacher()));
        Course.registerA(new Applicant<Student>(new Student()));
        Course.registerA(new Applicant<WebStudent>(new WebStudent()));
        Course.registerA(new Applicant<MobileStudent>(new MobileStudent()));


        //Course.registerB(new Applicant<Persion>(new Persion()));//error
        //Course.registerB(new Applicant<Teacher>(new Teacher()));//error
        Course.registerB(new Applicant<Student>(new Student()));
        Course.registerB(new Applicant<WebStudent>(new WebStudent()));
        Course.registerB(new Applicant<MobileStudent>(new MobileStudent()));

        Course.registerC(new Applicant<Persion>(new Persion()));
        Course.registerC(new Applicant<Teacher>(new Teacher()));
//        Course.registerC(new Applicant<Student>(new Student()));
//        Course.registerC(new Applicant<WebStudent>(new WebStudent()));
//        Course.registerC(new Applicant<MobileStudent>(new MobileStudent()));



    }
}
