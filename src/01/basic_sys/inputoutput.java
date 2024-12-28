package basic_sys;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        // 출력
        int age = 10;

        System.out.println("안녕하세요");
        System.out.print(1);
        System.out.printf("제 아이는 %d 살입니다.", age);
        System.out.println("ddd");

        System.out.println("공백으로 구분하여 이름/나이/키/결혼여부를 입력해주세요");
        Scanner scan = new Scanner(System.in);

        String name = scan.next();//공백 이전의 string을 불러옴
        int age2 = scan.nextInt(); //공백 이전의 int형을 불려옴
        double height = scan.nextDouble();//공백 이전의 키를 불러옴
        boolean single = scan.nextBoolean();//공백 이전의 boolean을 불러옴


        System.out.println("===입력 결과 출력======");
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age2);
        System.out.println("키 :"+ height);
        System.out.println("결혼 여부" + single);


        //연산자 정수형


    }
}
