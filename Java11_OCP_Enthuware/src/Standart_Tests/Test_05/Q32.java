package Standart_Tests.Test_05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Q32 {
    public static void main(String[] args) {


//        Given:

        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x->x.length();
        Consumer<Integer> c = x->System.out.print("Len:"+x+" ");
        Predicate<String> p = x->"".equals(x);
//        strList.forEach(  *INSERT CODE HERE*  );


//        What can be inserted in the code above?
        compute1();
        compute2();
        compute3();
        compute4();
    }

    static void compute1() {

        System.out.println();
    }

    static void compute2() {

        System.out.println();
    }

    static void compute3() {

        System.out.println();
    }

    static void compute4() {

        System.out.println();
    }
}
