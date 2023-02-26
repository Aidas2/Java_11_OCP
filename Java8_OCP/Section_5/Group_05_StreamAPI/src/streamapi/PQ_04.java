package streamapi;

import java.util.*;

public class PQ_04 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.stream()
               .map(num -> num * 2)             // line n1
               .peek(System.out::print)         // line n2
               .count();
    }
}
