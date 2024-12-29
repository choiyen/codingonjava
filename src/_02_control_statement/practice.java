package _02_control_statement;

import java.util.Scanner;



public class practice {
    public static void main(String[] args)
    {
        //예제 일번
//        System.out.println("나이를 입력하세요.");
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        if(8 <= number && 13 >= number )
//        {
//            System.out.println("초등학생");
//        }
//        else if (14 <= number && number <= 16)
//        {
//            System.out.println("중학생");
//        }
//        else if(17 <= number && number <= 19)
//        {
//            System.out.println("고등학생");
//        }
//        else if(20<= number)
//        {
//            System.out.println("성인");
//        }


    Scanner scan = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = scan.nextLine();
//        if(name.equals("홍길동"))
//        {
//            System.out.println("남자");
//        }
//        else if(name.equals("성춘향"))
//        {
//            System.out.println("여자");
//        }

        System.out.println("정수 세개를 입력 받을 예정");
        int[] number = new int[3];
        for(int i = 0; i < 3; i++)
        {
            System.out.printf("%d번째 수를 입력하세요\n", i+1);
            number[i] = scan.nextInt();
        }
        int s = 0;
        int b = 0;
        int sum = 0;
        s = number[0];
        for(int i = 0; i < 3; i++)
        {
            s = Math.min(s, number[i]);
            b = Math.max(b, number[i]);
            sum += number[i];
        }

        double avg = ((double)sum)/3;
        System.out.printf("최댓값 : %d, 최솟값 : %d 합계 : %d 평균 : %f", b, s, sum, avg);

    }
}
