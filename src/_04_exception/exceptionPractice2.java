package _04_exception;

import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsolePlugin;

import java.util.*;

public class exceptionPractice2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("배열의 크기를 입력하십시오 : ");
            int count = scan.nextInt();
            if(count <= 0)
            {
                throw new IllegalAccessException("배열 크기는 1 이사상이어야 한다.");
            }
            int [] array = new int[count];
            ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>();
            arrayList2D.add(new ArrayList<>(){});
            for (int i = 0; i < count; i++) {
                System.out.printf("%d 번째 숫자를 입력하십시오", i + 1);
                array[i] = scan.nextInt();
            }
            System.out.println(Arrays.toString(array));
            int j = 0;
            boolean define = true;
            while (true)
            {
                if(j >= array.length)
                {
                    break;
                }
                for (int i = 0; i <arrayList2D.size(); i++)
                {
                    if(arrayList2D.get(i).contains(array[j]))
                    {
                        arrayList2D.get(i).add(array[j]);
                        define = true;
                        break;
                    }
                    else
                    {
                        define = false;
                    }
                }
                if(define == false)
                {
                    if(arrayList2D.get(0).isEmpty())
                    {
                        arrayList2D.get(0).add(array[j]);
                    }
                    else
                    {
                        arrayList2D.add(new ArrayList<Integer>());
                        arrayList2D.getLast().add(array[j]);
                    }
                }
                j++;
            }
            System.out.println(arrayList2D);
            ArrayList<Integer> duplication = findDuplicaties(array);
            if(duplication.isEmpty())
            {
                System.out.println("중복된 값이 없습니다.");
            }
            else
            {
                System.out.println("중복된 값에 대한 배열" + duplication);
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("지정 가능한 범위를 넘어섬");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("지정된 배열의 크기를 벗어남");
        }
        catch (InputMismatchException e)
        {
            System.out.println("지정된 input을 모두 벗어남");
        }
        catch (IllegalAccessException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            scan.close();
        }
    }
    //중복된 요소를 찾는 메서드
    public static ArrayList<Integer> findDuplicaties(int [] arr)
    {
        //ex. arr : [1,2,3,4,5]
        // index
        // 0에 대해서 1,2,3,4 비교 => i=0; j<1=length =1;
        // 1에 대해서 2,3,4 비교
        // 2에 대해서 3,4 비교
        // 3에 대해서 4 비교
        ArrayList<Integer> Duplicaties = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[i] == arr[j] && !Duplicaties.contains(arr[j]))
                {
                    Duplicaties.add(arr[i]);
                }
            }
        }
        return Duplicaties;
    }
}