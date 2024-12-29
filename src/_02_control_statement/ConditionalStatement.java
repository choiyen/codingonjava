package _02_control_statement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConditionalStatement
{
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        /// ///////////////////////////////////
        // 문자[String 비교) :  객체로 판정
        System.out.println("이름을 입력해주세요");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine(); //enter 이전까지의 문자열을 읽어옴
        System.out.println("name 값 비교 : " + name);

        // '==' 두개짜리를 사용한다.(X)
//        if (name == "홍길동")
//        {
//            System.out.println("환영합니다.");
//        }
//        else
//        {
//            System.out.println("이름을 다시 확인해주세요!");
//        }

        //equals 사용 가능
        if (name.equals("홍길동") == true) {
            System.out.println("환영합니다.");
        } else {
            System.out.println("이름을 다시 확인해주세요!");
        }

        // Why??
        // '=-' 두 객체의 참조를 비교함 -> 동일한 메모리의 위치를 가르키는지 확인을 하겠다.
        // .equals 메서드는 두 객체의 내용이 동일한지 비교함.


        String str1 = "hello";
        String str2 = "hello";
        //문자열 리터렬의 경우, java에선 특별한 취급을 함.
        //동일한 문자열 리터럴이 사용될 경우,
        // java 컴파일러는 문자열 풀(String pool) 이라는 공유된 메모리 영역에  저장.
        // ==, str1과 str2가 같은 문자열을 가리키고 있으므로 같은 참조를 가리킴.


        if (str1 == str2) {
            System.out.println("두개가 같은 참조를 가리킨다."); //출력이 된다.
        } else {
            System.out.println("서로 다른 참조를 가르킨다.");
        }

        if (str1.equals(str2)) {
            System.out.println("내용이 같다");
        } else {
            System.out.println("내용이 다르다.");
        }

        //문자열 "동적 할당"의 경, new String("...."); 새로운 문자열 객체를 생성함므로 서로 다른 객체를 가리킴.
        String str3 = new String("hi");
        String str4 = new String("hi");

        if (str3 == str4) {
            System.out.println("두개가 같은 참조를 가리킨다."); //출력이 된다.
        } else {
            System.out.println("서로 다른 참조를 가르킨다.");
        }

        if (str3.equals(str4)) {
            System.out.println("내용이 같다");
        } else {
            System.out.println("내용이 다르다.");
        }

        /// ///////////////////////////
        //if~else if
        if (number % 3 == 0) {
            System.out.println("3의 배수");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수");
        } else {
            System.out.println("3의 배수도 5의 배수도 아니다.");
        }

        // switch == case 문
        // = break는 선택 사항, 생략 시 바로 미의 case로 넘어감.
        String DayOfWeek;
        int day = 4;

        DayOfWeek = switch (day) {
            case 1 -> "일요일";
            case 2 -> "월요일";
            case 3 -> "화요일";
            case 4, 5, 6, 7 -> "수~금요일";
            default -> "잘못된 입력값입니다.";
        };

//        switch (day) {
//            case 1:
//                DayOfWeek = "일요일";
//                break;
//            case 2:
//                DayOfWeek = "월요일";
//                break;
//            case 3:
//                DayOfWeek = "화요일";
//                break;
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//                DayOfWeek = "수~금요일";
//                break;
//            default:
//                DayOfWeek = "잘못된 입력값입니다.";
//                break;
//
//        }
    }
}
