package Standart_Tests.Test_06;

import java.util.Arrays;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(100, 200, 230, 291, 43);

//        System.out.println(al.asStream().reduce((i)->i<200).count());
//        System.out.println(al.stream().map((i)->i<200, i).count());
//        System.out.println(al.stream().filter((i)->i<200).list().count());
        System.out.println(al.stream().filter((i)->i<200).count());
//        System.out.println(al.asStream().filter((i)->i<200).count());


    }
}
