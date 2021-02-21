package Standart_Tests.Test_05;
/*
What will the following code print?
You had to select 1 option
        10 9
        10 10
        6 9
        6 10
        5 11
*/

public class Q16 {
    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1+" "+val2);
    }
}
