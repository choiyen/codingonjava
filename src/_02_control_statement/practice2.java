package _02_control_statement;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for(int i = 1; i <= s; i++)
        {
            System.out.println(i);
        }
    }
}
