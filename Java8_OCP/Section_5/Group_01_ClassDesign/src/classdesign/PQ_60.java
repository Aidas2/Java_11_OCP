package classdesign;

class A2 {

    public void runA() {
        System.out.println("ArunA");
    }
}

class B2 extends A2 {

    public void runA() {
        System.out.println("BrunA");
    }

    public void runB() {
        System.out.println("BrunB");
    }
}

class Test {

    public static void main(String[] args) {
        A2 a = new B2();
        B2 b = (B2) a;
        b.runB();
        a.runA();
    }
}

public class PQ_60 {

}
