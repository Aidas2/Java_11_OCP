package Standart_Tests.Test_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q29 {
    public static void main(String[] args) {

//        Given:
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");
/*
        Which of the following lines of code will print the following output?
        a
        b
        1
        2*/

        Stream.of(l1, l2).forEach((x)->System.out.println(x));
        System.out.println("==============");
        Stream.of(l1, l2).flatMap((x)->Stream.of(x)).forEach((x)->System.out.println(x));
        System.out.println("==============");
        Stream.of(l1, l2).flatMap((x)->x.stream()).forEach((x)->System.out.println(x));
        System.out.println("==============");
//        Stream.of(l1, l2).flatMap((x)->x.iterator()).forEach((x)->System.out.println(x));

    }
}
