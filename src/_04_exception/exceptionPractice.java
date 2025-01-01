package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionPractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("몇개의 숫자를 입력할 생각인가요?");
            int count = scan.nextInt();
            int [] number = new int[count];
            if(count <= 0)
            {
                throw new IllegalAccessException("배열 크기는 1 이사상이어야 한다.");
            }
            double avg = 0;
            int sum =0;
            for (int i = 0; i < count + 1; i++) {
                System.out.printf("%d 번쨰 숫자는 ?", i+1);
                number[i] = scan.nextInt();
                sum += number[i];
            }
            avg = (double)sum/0;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("설정할 수 있는 배열의 크기를 벗어남");
        }
        catch (NullPointerException e)
        {
            System.out.println("배열에 내용이 없는데 출력");
        }
        catch (ArithmeticException e)
        {
            System.out.println("0으로 나눌려고 시도함");
        }
        catch (InputMismatchException e)
        {
            System.out.println("문자열은 입력 불가");
        }
        catch (IllegalAccessException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            scan.close();
        }
    }
}
