package _10_Collection.Paractice;

import java.util.*;

public class paractice2
{
    public static void main(String[] args) {
        Map<String, Integer> key = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요 '종료'를 입력하면 종료됩니다.");
        while (true)
        {
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            if(name.equals("종료"))
            {
                break;
            }
            System.out.print("나이 입력 :");
            int age = scanner.nextInt();
            key.put(name, age);
        }

        System.out.println("=======입력 받은 이름과 나이 목록 ====");
        Set<Map.Entry<String, Integer>> entrySet = key.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> entry = iterator.next();
            //System.out.println(entry);
            Integer k = entry.getValue();
            String s = entry.getKey();
            System.out.printf("이름 : %s, 나이: %d", s, k);
        }

    }
}
