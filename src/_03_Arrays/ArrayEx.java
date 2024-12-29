package _03_Arrays;

import java.util.Arrays;

public class ArrayEx
{
    public static void main(String[] args)
    {
        //표준 배열
        //배열
        //-배열에 저장할 자료형을 선언하고, 배열 이름과 크기를 선언해야 함.
        //-배열의 원소는 모두 같은 타입
        //-처음 선언한 배열 크기 변경 불가능(단, ArrayList 컬렛션의 경우, 동적으로 크기 조절 가능)

        //배열 변수 선언
        //- 두가지 방법이 있으나, 관례적으로 첫번쨰 방법을 쓰는 게 좋음
        //1. 타입[] 변수
        //2. 타입 변수[]

        int[] arr1;
        int arr2[];

        //- 배열의 변수는 참조형으로 된 변수
        //- 배열도 객체이므로 힙이라는 영역에 생성이 되고, 배열 변수는  힙 영역에 저장함.
        //- 따라서 참조할 배열이 없다면 null로 초기화가 가능하다.
        // -> 배열 변수가 null 값을 가진 상태에서 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPointerException이 발생됨.

        String[] temp = null;
        //System.out.println(temp);//null
        //temp[0];//error

        // - 값 목록으로 배열 변수 선언과 배열 생성
        int[] intArray = {16,22,14,34,41,59};
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println("intArray : " + intArray);//참조할 주소 값이 저장됨.

        //-주의, 중괄호로 감싼 목록을 배열 변수에 대입을 할 때, 배열 변수를 미리 선언한 수에는 값의 목록을 대입할 수 없음
        char[] charArray;
        //charArray = {'A','B','C'};
        charArray = new char[]{'A','B','C'};
        //배열 변수 선언 시점과 값 목록 대입 시점이 다르다면 "new" 타입[] 대괄호를 목록 앞에 붙여줘야 한다.

        System.out.println("charArray[0] : " + charArray[0]);

        // - new 연산자로 배열 선언과 배열 생성
        // - new 연산자로 배열을 생성하면 기본값으로 초괴화됨. int면 0, double이면 0.0
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화된 값 : " + doubleArray[0]);

        /// /////////
        // 배열 길이 : length
        // length 필드는 읽기만 가능, 값 변경 불가능
        // 배열 길이는 반복문에서 많이 사용됨
        // 배열 길이를 멋어나면? ArrayIndexOutOfRoundsException
        //System.out.println(doubleArray[doubleArray.length]);

        /// ////////////////////////
        //배열 출력
        // - tostring() : 배열의 내용을 문자열로 변환하여 반환함
        System.out.println("intArrays  :" + Arrays.toString(intArray));
        System.out.println("charArrays : " + Arrays.toString(charArray));
    }
}
