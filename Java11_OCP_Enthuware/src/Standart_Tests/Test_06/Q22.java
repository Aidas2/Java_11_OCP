package Standart_Tests.Test_06;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Q22 {
    public static void main(String[] args) {

//        What will the following code print when compiled and run?

        Collection<Number> col = new HashSet<>();
        col.add(1);
        var list1 = List.of(col); //1
        System.out.println(list1);
        col.add(2); //2
        System.out.println(list1);
        var list2 = List.copyOf(col); //3
        System.out.println(list1+", "+list2);

    }
}
