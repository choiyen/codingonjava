package _10_Collection._list;

import _05_Class._02_access_modifier._pack1.B;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx
{
    public static void main(String[] args)
    {
        // ArrayList 컬렉션 생성
        List<Book> list = new ArrayList<>();


        //객체 추가
        list.add(new Book("title1", "auther1"));
        list.add(new Book("title2", "auther2"));
        list.add(new Book("title3", "auther3"));
        list.add(new Book("title4", "auther4"));
        list.add(new Book("title5", "auther5"));

        System.out.println(list.toString());
        System.out.printf("총 %d 권의 책이 존재합니다. \n\n", list.size());

        // 객체 가져오기 (인덱스 이용)
        System.out.println(list.get(2));


        //삭제
        list.remove(2);
        System.out.println(list.toString());

        //모든 객체 삭제
        System.out.println("객체가 비어 있나요? " + list.isEmpty());
        list.clear();
        System.out.println("객체가 비어 있나요? " + list.isEmpty());



    }
}
