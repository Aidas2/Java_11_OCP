package classdesign;
import java.util.*;

interface Surveillable {
}

class Target implements Surveillable {
}

class PrimeSuspect extends Target {
}

class Mission {

    public static void main(String[] args) {
        List objectives = new ArrayList();
        Surveillable s1 = new Target();
        Surveillable s2 = new PrimeSuspect(); // line n1
        Target t1 = new PrimeSuspect();
        objectives.add(s1);
        objectives.add(s2);
        objectives.add(t1); // line n2
        for (Object item : objectives) {
            System.out.println(item.getClass().getName());
        }
    }
}

public class PQ_63 {

}
