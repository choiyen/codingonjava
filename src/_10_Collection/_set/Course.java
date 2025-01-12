package _10_Collection._set;

public class Course
{
    private int id;
    private String title;

    public Course(int id, String title)
    {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course {" + "title  = '" + title + "', id = '" + id + "' }";
    }

    //hashCode 란?
    // - hashCode : 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
    // 즉, hashSet에서 관련이 있음.
    //- hashCode() 메서드 : Object 클레스에 정의되어 있으며, 객체의 해시 코드를 반환하는 함수
    //- 클래스에서 hashSet 재정의 : 객체의 내부 상태를 기반으로 한 고유한 해시 코드를 생성
    // => Id, title 값이 같으면 동일한 HashCode 리턴
    @Override
    public int hashCode() {
        //title은 String 이므로 hashcode 메서드 사용
        // id는 int 이므로 정수 값의 해시 코드에 더하기 연산
        return title.hashCode() + id;
    }

    //id, title 값이 같으면 true를 리턴하도록 재정의
    public boolean equals(Object obj)
    {
        if(obj instanceof Course target)
        {
            return target.id == id && target.title.equals(title);
        }
        else
        {
            return  false;
        }
    }
}
//hashSet에서 사용자 정의 클레스를 넣을 경우, equals와 hashcode를 재정의해야 한다.