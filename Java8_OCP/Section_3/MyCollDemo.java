package morning;
import java.util.*;

class MyColl<T>{
    Collection<? extends T> coll;
    void setColl(Collection<? extends T> coll){
        this.coll = coll;
    }

}


public class MyCollDemo {
    public static void main(String[] args) {
        MyColl<Number> mc = new MyColl<>();
        List<Integer> coll = new ArrayList<>();
        
        mc.setColl(coll);

    }
}
