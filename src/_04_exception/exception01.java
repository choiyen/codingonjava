package _04_exception;

public class exception01
{
    public static void main(String[] args) {
        int[] arr = new int[4];

        try {
            for(int i = 0; i <arr.length+1; i++)
            {
                arr[i] =i;
                System.out.println("index : " + i + ": " + arr[i] );
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
