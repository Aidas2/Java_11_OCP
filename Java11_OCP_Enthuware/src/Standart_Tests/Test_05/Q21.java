package Standart_Tests.Test_05;

import java.util.Arrays;
import java.util.List;

public class Q21 {
    public static void main(String[] args) {
        stream();
        stream2();
    }

    static void stream() {
        List<Double> dList = Arrays.asList(10.0, 12.0);
        dList.stream().forEach(x -> {
            x = x + 10;
//            System.out.println(x);
        });
        dList.stream().forEach(d -> System.out.println(d));
    }


    static void stream2() {
        List<StringBuilder> dList = Arrays.asList(new StringBuilder("a"), new StringBuilder("aa"));
        dList.stream().forEach(x -> x.append("b"));
        dList.stream().forEach(x -> System.out.println(x));
    }
}
