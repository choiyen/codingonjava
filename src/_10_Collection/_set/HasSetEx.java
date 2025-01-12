package _10_Collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetEx
{
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set1 = new HashSet<>();

        //객체에 저장
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");
        set1.add("banana");//중복값은 들어가지 않음.
        System.out.println(set1);


        /// /////////////
        //Course 클래스
        Set<Course> set2 = new HashSet<>();

        //객체 저장 - 컴퓨터 입장에선 동일하지 않음.
        Course java = new Course(101,"java");
        Course js1 = new Course(102, "javaScript");
        Course js2 = new Course(102, "javaScript");

        set2.add(java);
        set2.add(js1);
        set2.add(js2);
        System.out.println(set2);
        System.out.println(java.hashCode());
        System.out.println(js1.hashCode());
        System.out.println(js2.hashCode());

        System.out.println(js1.equals(js2));

        // 전체 요소 접근
        // case 1. 반복문 사용
        System.out.println("== 반복문으로 Set 객체 출력 ======== ");
        for(Course c : set2)
        {
            System.out.println(c);
        }
        // case 2. iterator() 메소드로 반복자를 얻어 객체 하나씩 가져오기
        //- boolean hasNext() : 가져올 객체가 있으면 true, 없으면 false 반환
        //- E next() : 컬렉션에서 하나의 객체를 가져옴
        //- void remove(); : next()로 가져온 객체를 Set 컬렉션에서 제거
        System.out.println("== iterator()메서드로 Set 객체 출력 ======== ");
        Iterator <Course> iterator = set2.iterator();


        while (iterator.hasNext()) {
            Course c = iterator.next();
            System.out.println(c);
        }


    }
}
