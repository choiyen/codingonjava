package _10_Collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx
{
    public static void main(String[] args) {
        // ArrayList 컬렉션 객체 생성
        List <String> list = new ArrayList<>();

        //LinkedList 컬렛션 객체 생성
        List <String> list2 = new LinkedList<>();

        //시작과 끝 변수 선언
        long startTime;
        long endTime;

        //ArrayList의 0번 인덱스에 데이터 추가를 10000번 반복
        startTime = System.nanoTime();
        for (int i = 0; i  < 10000; i++)
        {
            list.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList 소요 시간 : " + (endTime - startTime));

        //ArrayList의 0번 인덱스에 데이터 추가를 10000번 반복
        startTime = System.nanoTime();
        for (int i = 0; i  < 10000; i++)
        {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("LinkedList 소요 시간 : " + (endTime - startTime));
        //시간이 더 짧게 걸림


        //결과 :
        //- LinkedList 가 요소 추가에 대해서 더 빠른 성능을 냄.

    }
}
