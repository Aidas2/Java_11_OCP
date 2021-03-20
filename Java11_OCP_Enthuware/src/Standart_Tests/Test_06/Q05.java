package Standart_Tests.Test_06;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class Q05 {
    public static void main(String[] args) {

//        Given:

        List<Double> dList = Arrays.asList(10.0, 12.0);
        DoubleFunction df = x->x+10;
//        dList.stream().forEach(df);
        dList.stream().forEach(d->System.out.println(d));

//        What will it print when compiled and run?
    }

}
