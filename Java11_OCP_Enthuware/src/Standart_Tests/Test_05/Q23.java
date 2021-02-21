package Standart_Tests.Test_05;

public class Q23 {
    public static void main(String[] args) {
        compute1();
        compute2();
        compute3();
        compute4();
        compute5();
        compute6();
    }

    static void compute1() {
//        char[][] cA = {{'a', 'b', 'c'}, {'a', 'b', 'c'}};
//        System.out.println(cA[2][3]);
    }

    static void compute2() {
        char cA[][] = new char[3][];
        for (int i = 0; i < cA.length; i++) cA[i] = new char[4];
        System.out.println(cA[2][3]);
    }

    static void compute3() {
//        char cA[][] = {new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'c'}};
//        System.out.println(cA[2][3]);
    }

    static void compute4() {
//        char cA[3][2] = new char[][]{{'a', 'b', 'c'}, {'a', 'b', 'c'}};
//        System.out.println(cA[2][3]);
    }

    static void compute5() {
//        char[][] cA = {"1234", "1234", "1234"};
//        System.out.println(cA[2][3]);
    }

    static void compute6() {
//        var cA[][] = new char[3][];
//        for (var i = 0; i < cA.length; i++) cA[i] = new char[4];
//        System.out.println(cA[2][3]);
    }
}
