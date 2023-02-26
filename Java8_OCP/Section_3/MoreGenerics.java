package morning;

import java.util.*;
import java.util.function.*;

enum Season {
    WINTER;
    static <T> void run(T arg){
        System.out.println(arg);
    }

}

class One {

    <T> void run(T arg){
        System.out.println(arg);
    }

}


public class MoreGenerics {
    public static void main(String[] args) {
        
        List<? super Number> list = new ArrayList<>();
        
        Predicate<Object> pred = e -> e.hashCode() % 2 == 0;
        
        list.stream()
            .filter(pred)   // public boolean filter(Predicate<? super T>)
            .forEach(System.out::println);
        
        
        
    }
}
