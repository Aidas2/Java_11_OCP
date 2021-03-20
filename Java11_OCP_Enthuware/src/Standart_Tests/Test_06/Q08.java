package Standart_Tests.Test_06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q08 {
    public static void main(String[] args) {

//        Given:
        List<Integer> names = Arrays.asList(1, 2, 3);

//        How many of the following lines will print exactly 6?

        System.out.println(names.stream().mapToInt(x->x).sum());

//        System.out.println(names.stream().forEach((sum, x)->sum = sum + x));

        System.out.println(names.stream().reduce(0, (a, b)->a+b));

        System.out.println(names.stream().collect(Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum());

        System.out.println(names.stream().collect(Collectors.summarizingInt(x->x)).getSum());

    }
}
