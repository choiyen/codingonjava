package _10_Collection.Paractice;

import java.util.HashSet;
import java.util.Scanner;

public class paractice1
{
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("정수 입력 :");
            int s = scanner.nextInt();
            if(s == -1)
            {
                break;
            }
            hashSet.add(s);
        }

        System.out.println("중복이 제거된 정수 목록 : " + hashSet);
    }

}
