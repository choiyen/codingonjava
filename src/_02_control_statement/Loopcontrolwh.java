package _02_control_statement;

public class Loopcontrolwh
{
    public static void main(String[] args)
    {
        // 기본 for 문
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }


        //while 문
        int k = 0;
        while (k <= 10)
        {
            System.out.println(k);
            k++;
        }

        /// ///////////
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 0);


        /// ////////////////
        //for ~ each 문
        System.out.println("=================");
        String [] array = {"a","b", "c"};
        for(String a : array)
        {
            System.out.println("a = " + a);
        }




    }
}
