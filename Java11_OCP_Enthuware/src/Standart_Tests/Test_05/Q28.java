package Standart_Tests.Test_05;

public class Q28 {
/*
    What will happen when the following code is compiled and run?
    It will throw NullPointerException at runtime.
    It will throw ArrayIndexOutOfBoundsException at runtime.
    It will throw ExceptionInInitializerError at runtime.
    It will not compile.
*/

        static int[] x = new int[0];
        static{
            x[0] = 10;
        }
        public static void main(String[] args){
            var ax = new Q28();
        }

}
