package Standart_Tests.Test_05;

public class Q25 {
    int i;

    public Q25(int i) {
        this.i = i;
    }

    public String toString() {
        System.out.println("call");
        if (i == 0) return null;
        else return "" + i;
    }

    public static void main(String[] args) {
        Q25 t1 = new Q25(10);
        Q25 t2 = new Q25(2);
        System.out.println(t2);
        System.out.println("" + t1);
    }
}
