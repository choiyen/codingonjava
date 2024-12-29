package basic_sys;

public class Casting {
    public static void main(String[] args) {
        //묵시적 형변환(Wider Conversion)
        //- 더 적은 타입에서 더 큰 타입으로 자동 형변환
        //- 반대의 경우는 묵싲거 형변환 불가능 -> 명시적으로 변환해야 함.

        int smallNumber = 10;
        double bigNumber = smallNumber;

        System.out.printf("smallNumber : %d \n", smallNumber);
        System.out.println("bigNumber : "+ bigNumber);

        //명시적 형변환(Narrow Conversion)
        //- 더 큰 타입에서 더 작은 타입으로의 강제 형변환
        double bigNumber2 = 20.5;
        int smallNumber2 = (int)bigNumber2;

        System.out.printf("smallNumber : %d \n", smallNumber2); //데이터의 결손이 일어남.
        System.out.println("bigNumber : "+ bigNumber2);

        // 데이터 손실이 발생할 수 있는 경우, 주의할 필요가 있다.
        int LargeNumber = 1000;
        byte SmallByle = (byte) LargeNumber;
        System.out.printf("LargeNumber :\n" + LargeNumber);
        System.out.printf("SmallByle :" + SmallByle);

    }
}
