package functionalinterfaces;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class PQ_21 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);

        // line n1        

//        Stream.of(list1, list2)
//              .flatMap(x -> x.stream())
//              .forEach(x -> System.out.print(x + " "));
//        
//        Stream.of(list1, list2)
//              .flatMap(x -> x.intStream())
//              .forEach(x -> System.out.print(x + " "));
//        
//        list1.stream()
//             .flatMap(list2.stream()
//                           .flatMap(x -> x.stream())
//             .forEach(x -> System.out.println(x + " "));
//        
//        Stream.of(list1, list2)
//              .flatMapToInt(x -> x.stream())
//              .forEach(x -> System.out.print(x + " "));        
    }
}
