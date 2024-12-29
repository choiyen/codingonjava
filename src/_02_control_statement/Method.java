package _02_control_statement;

public class Method
{
    //메서드 정의
    /*
    접근제어자 함수메서드리턴타입 메서드이름(인자, 인자....)
      // 메서드 내용
      return 반환값;
     */

    //반환값이 없는 메서드
    public static void hello()
    {
        System.out.println("Hello Java");
    }
    //반환값이 있는 메서드
    public static int sum1(int x, int y) {
        return x + y;
    }


    public static void main(String[] args)
    {
        hello();
        System.out.println(sum1(10,20));
        int [] numbers = {10, 20};
        int [] numbers2 = {10,20,30,40};
        System.out.println(mul1(10,20));
        System.out.println(mul2(numbers));
        System.out.println(mul2(new int[] {10,20}));
    }

    //call by value : 값을 전달
    public static int mul1(int x, int y){
        return x * y;
    }
    //call bu reference
    public static int mul2(int [] nums)//주소값을 넘겨주는 느낌
    {
        return nums[0] * nums[1];
    }

}
