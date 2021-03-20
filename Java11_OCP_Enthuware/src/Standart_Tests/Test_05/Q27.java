package Standart_Tests.Test_05;

public class Q27 {

/*
    Which exact exception class will the following class throw when compiled and run?
    NullPointerException
    ArrayIndexOutOfBoundsException
    Exception
    RuntimeException
*/
    public static void main(String[] args) throws Exception{
        int[] a = null;
        int i = a [ m1() ];
    }
    public static int m1() throws Exception{
        throw new Exception("Some Exception");
    }

}
