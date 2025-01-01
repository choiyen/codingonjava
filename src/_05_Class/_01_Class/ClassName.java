package _05_Class._01_Class;

import java.util.Scanner;

// 클래스 명 : 파스칼 케이스로 작성
public class ClassName
{
    //필드
    public int number;
    public String name;

    //메소드
    //생성자 : 클래스명과 이름이 동일한 메서드
    //-객체가 생성도리 때 자동으로 호출
    //초기화 담당.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("사각형의 가로와 새로 길이를 띄어쓰기 기준으로 입력해주세요");

        int width = scan.nextInt();
        int height = scan.nextInt();

        //입력 받은 값으로 ExRectangle 객체 생성
        ExRectangle rect = new ExRectangle(width, height);
        System.out.println("사각형의 넒이 : " + rect.area());

        scan.close();

    }
}



