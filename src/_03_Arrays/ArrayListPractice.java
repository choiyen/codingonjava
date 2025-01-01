package _03_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.println("문자를 입력해주세요.");
            String coding = scan.nextLine();
            if(coding.equals("exit"))
            {
                for (String s  : array)
                {
                    System.out.println(s);
                }
                break;
            }
            else
            {
                array.add(coding);
            }
        }
        scan.close();
    }
}
