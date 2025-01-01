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

        /// ///////////////////////
        //다차원 배열
        //-배열 안에 또 다른 배열이 존재하는 배열
        //2X3배열 생성 및 초기화
        int [][] matrix = {{1,2,3},{4,5,6}};

        // 3 X 2 배열 생성 및 초기화
        int [][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;


        /// //////////////////////////
        // 3차원 배열 생성 및 초기화
        int [][][] threeArray = {{{1,2},{3,4}},{{5,6},{7,8}}};

        System.out.println("three matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < threeArray.length; i++) {
            for (int j = 0; j < threeArray[i].length; j++) {
                for (int z = 0; z < threeArray[i][j].length; z++) {
                    System.out.print(threeArray[i][j][z]);
                }
                System.out.print("\n");
            }
        }

        /// /////////////////////////////////////
        //객체를 참조하는 배열
        //-객체 형태를 참조하는 배열
        //-기본 타입 벼열은 각각의 항목에 대해서 직접 저장
        //-참조 타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 지정
        String [] langs = new String[3];
        langs[0] = "java";
        langs[1] = "java";
        langs[2] = new String("java");

        System.out.println(langs[0] == langs[1]); //true : 같은 객체를 참조
        System.out.println(langs[1] == langs[2]); //false : 다른 객체를 참조
        System.out.println(langs[0].equals(langs[2]));//true : 다른 객체의 내용을 검사

        /// ////////////////////////////////////////////////
        //배열 복사
        // - 배열은 크기가 고정되어 있음.
        // -> 더 많은 저장 공간이 필요하다면 더 큰 길이의 배열을 새ㅒ

        //1) 반복문으로 요소 하나씩 복제
        int[] originArr = {1,2,3};
        int[] newArr = new int[5];
        System.out.println(Arrays.toString(originArr));

        for (int i = 0; i < originArr.length; i++) {
            newArr[i] = originArr[i];
        }

        System.out.println(Arrays.toString(newArr));


        //2) Arraycopy() 사용
        //System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        //- 원본 배열, 원본 배열 복사 시작 인덱스, 새 배열, 새 배열의 어떤 인덱스부터 붙여넣을 꺼냐?, 복사를 몇개할 것인가.
        String [] originFruits = {"apple","banana","kimi"};
        String [] newFruits = new String[5];

        System.arraycopy(originFruits, 1,newFruits,1,originFruits.length -1);
        System.out.println(Arrays.toString(originFruits));
        System.out.println(Arrays.toString(newFruits));

        /// ///////////////////////////////////////
        // Arrays 메소드
        //copyOf(arr, copyArrayLength) :값을 복사하고 특정 크기의 배열을 만듬.
        int [] orginArray = {1,2,3,4,5};
        int [] copyedArray = Arrays.copyOf(orginArray,3);

        System.out.println("Origin :" + Arrays.toString(orginArray));
        System.out.println("Copyed :" + Arrays.toString(copyedArray));

        //copyOfRange(arr, sidx, sidy)
        int [] rangeArray = Arrays.copyOfRange(orginArray,1,3);//from부터 to까지의 배열을 복사
        System.out.println("Ranage : " + Arrays.toString(rangeArray));

        //fill(arr, s) : n 값으로 배열의 값을 초기화
        int [] filledArray = new int[5];
        System.out.println("filled (before) ; " + Arrays.toString(filledArray));
        Arrays.fill(filledArray, 7);
        System.out.println("filled (after) : " + Arrays.toString(filledArray));

        //sort(arr) : 정렬
        int [] unSortedArray = {5,3,1,4,2};
        Arrays.sort(unSortedArray);
        System.out.println("Sorted : " + Arrays.toString(unSortedArray));


        //equals(arr1,arr2)
        int [] Array1 = {1,2,3};
        int [] Array2 = {1,2,3};
        int [] Array3 = {4,2,3};

        boolean arraysEqual1 = Arrays.equals(Array1, Array2);
        boolean arraysEqual2 = Arrays.equals(Array1, Array3);

        System.out.println("Equals 1 VS 2 : " + arraysEqual1 ); //true
        System.out.println("Equals 1 VS 3 : " + arraysEqual2 ); //false

        System.out.println("Equals 1 VS 2 : " + (Array1 == Array2) ); //false
        System.out.println("Equals 1 VS 3 : " + (Array1 == Array3) ); //false

        //deepEquals : 배열 두개에 대해 비교)
        int [][] deepArray1 = {{1,2},{3,4}};
        int [][] deepArray2 = {{1,2},{3,4}};
        int [][] deepArray3 = {{1,2},{3,5}};

        boolean deeparraysEqual1 = Arrays.deepEquals(deepArray1, deepArray2);
        boolean deeparraysEqual2 = Arrays.deepEquals(deepArray1, deepArray3);

        System.out.println("deepEquals 1 VS 2 : " + deeparraysEqual1 ); //true
        System.out.println("deepEquals 1 VS 3 : " + deeparraysEqual2 ); //false

        System.out.println("deepEquals 1 VS 2 : " + (deepArray1 == deepArray2) ); //false
        System.out.println("deepEquals 1 VS 3 : " + (deepArray1 == deepArray3) ); //false


        //binarySearch(arr, val) : 정렬된 배열일떄 사용 가능
        int [] sortedArray = {10,20,30,50,70,90};
        int index = Arrays.binarySearch(sortedArray, 50);
        System.out.println("index of 50 :" + index);

    }
}
