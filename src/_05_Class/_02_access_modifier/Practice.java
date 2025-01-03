package _05_Class._02_access_modifier;

import _05_Class.Practice.Rectangle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        try {
            ArrayList<Rectangle> rectangles = new ArrayList<>();
            //사용자 정의 클래스를 담는 리스트.
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("사각형의 가로와 새로 길이를 띄어쓰기를 기준으로 입력해주세요.(둘다 0 입력 시 종료)");
                int width = scanner.nextInt();
                int height = scanner.nextInt();

                if (width == 0 && height == 0)
                {
                    for (int i = 0; i < rectangles.size(); i++)
                    {
                        System.out.println("가로 길이는 : " + rectangles.get(i).getWidth());
                        System.out.println("세로 길이는 s: " + rectangles.get(i).getHeight());
                        System.out.println("넓이는 : " + rectangles.get(i).size());
                        System.out.println("---------------------------------------");
                    }
                    break;
                }
                else
                {
                    rectangles.add(new Rectangle(width));
                    rectangles.getLast().setHeight(height);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("널포인트 값을 출력함");
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력하셔야 합니다.");
        }
    }
}
