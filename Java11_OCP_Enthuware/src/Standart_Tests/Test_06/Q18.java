package Standart_Tests.Test_06;

public class Q18 {
    public static void main(String[] args) {
        var a = new int[]{ 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println( a [ (a = b)[3] ] );
    }
}
