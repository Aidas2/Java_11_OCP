package streamapi;

import java.util.*;
import java.util.stream.*;

class OS {

    String name;

    OS(String name) {
        this.name = name;
    }
}

public class PQ_07 {

    public static void main(String[] args) {
        List<OS> list = Arrays.asList(
                new OS("Windows "),
                new OS("Solaris "),
                new OS("Linux "));
        Stream<OS> creek = list.stream();

        // line n1
//        creek.forEach(System.out::print);

//        creek.map(a -> a.name)
//             .forEachOrdered(System.out::print);
//
//        creek.map(a -> a)
//             .forEachOrdered(System.out::print);
//
//        creek.forEachOrdered(System.out::print);

    }
}
