package _10_Collection._map;

import _10_Collection._set.Course;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapEx
{
    public static void main(String[] args) {
        // 키는 id, 값은 main인 hashmap을 만든다.
        Map<Integer, String> map = new HashMap<>();

        //객체 저장(키 중복은 허용하지 않음)
        map.put(1001, "홍길동");
        map.put(1002, "김동수");
        map.put(1003, "강영희");
        map.put(1004, "최진호");
        map.put(1005, "이길영");



        //전체 객체 수
        int size = map.size();

        //키를 이용해서 값 얻기
        int key = 1003;
        String value = map.get(key);
        System.out.println(value);

        // 키와 값으로 구성된 모든 Map. Entry 객체를 Set 담아 리턴
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        //iterator
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, String> entry = iterator.next();
            //System.out.println(entry);
            Integer k = entry.getKey();
            String s = entry.getValue();
            System.out.printf("%s 학생은 %d 반 입니다.\n", s, k);
        }

        //키 Set 컬랙션 받고, 반복해서 값을 뽑음
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
        
        
        //주어진 키와 일치하는 엔트리 삭제
        String deleteValue = map.remove(key);
        System.out.printf("%s 학생이 퇴학했습니다.\n", deleteValue);
    }
}
