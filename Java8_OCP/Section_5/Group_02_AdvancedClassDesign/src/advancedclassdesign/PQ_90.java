package advancedclassdesign;

class Test<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String args[]) {
        Test<String> obj1 = new Test<>();
        Test obj2 = new Test();                // line n1
        obj1.setT("1Z0");
        obj2.setT(809);                        // line n2
        System.out.print(obj1.getT() + "-" + obj2.getT());
    }
}


public class PQ_90 {

}
