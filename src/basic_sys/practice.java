package basic_sys;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();//공백 이전의 string을 불러옴
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        System.out.printf("안녕하세요! %s 님(%d세)", name, age);
        scan.close();
    }
}
