package Standart_Tests.Test_05;

import java.util.Arrays;
import java.util.List;

public class Q41 {
    public static void main(String[] args) {
//        Given:
        List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
//        Which of the following expressions will return true?
//        System.out.println(ls.stream().anyMatch(44));
//        System.out.println(ls.stream().anyMatch(11));
        System.out.println(ls.stream().distinct().anyMatch(x->x==11));
//        System.out.println(ls.stream().distinct().allMatch(11));
        System.out.println(ls.stream().distinct().allMatch(x->x==11));
        System.out.println(ls.stream().noneMatch(x->x%11>0));
    }
}
