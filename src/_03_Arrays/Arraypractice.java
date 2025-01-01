package _03_Arrays;

import java.util.Scanner;

public class Arraypractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇개의 정수를 입력할 것인가요?");
        int sum = 0;
        double avg = 0;
        int count = scanner.nextInt();
        int [] number = new int[count];
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%d 번쨰 정수를 입력해주세요." , i+1);
            number[i] = scanner.nextInt();
            sum += number[i];
        }
        avg = (double) sum/number.length;

        System.out.printf("해당 %d 개의 숫자의 합은 %d 이고, 평균은 %.1f 이다", count, sum, avg );
    }
}
