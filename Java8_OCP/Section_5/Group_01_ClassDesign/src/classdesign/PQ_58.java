package classdesign;

class B implements A {

    public String toString() {
        return "B ";
    }

    public static void main(String[] args) {
        C myC = new C();
        B myB = myC;
        A myA = myB;
        System.out.print(myB);
        System.out.print((C) myB);
        System.out.print(myA);
    }
}

class C extends B {

    public String toString() {
        return "C ";
    }
}

interface A {

    public String toString();
}

public class PQ_58 {

}
