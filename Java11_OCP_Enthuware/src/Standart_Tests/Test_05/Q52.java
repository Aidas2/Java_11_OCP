package Standart_Tests.Test_05;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q52 {
    public static void main(String[] args) {

//        What will the following code print when compiled and run?

        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
        Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); //2
        System.out.println(obj);

    }

}
